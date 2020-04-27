package examples

import (
	"os"
	"path"
	"path/filepath"
	"testing"

	"github.com/pulumi/pulumi/pkg/v2/testing/integration"
)

func TestAccProjectTs(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "project", "ts"),
		})

	integration.ProgramTest(t, &test)
}

func TestAccProjectPython(t *testing.T) {
	test := getPythonBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "project", "python"),
		})

	integration.ProgramTest(t, &test)
}

func getBaseOptions(t *testing.T) integration.ProgramTestOptions {
	checkMongoDbAtlasToken(t)
	orgId := getMongoDbAtlasOrg(t)
	return integration.ProgramTestOptions{
		ExpectRefreshChanges: true,
		Config: map[string]string{
			"orgId": orgId,
		},
	}
}

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/mongodbatlas",
		},
	})

	return baseJS
}

func getPythonBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions(t)
	basePy := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			filepath.Join("..", "sdk", "python", "bin"),
		},
	})

	return basePy
}

func checkMongoDbAtlasToken(t *testing.T) {
	_, publicKeyFound := os.LookupEnv("MONGODB_ATLAS_PUBLIC_KEY")
	if !publicKeyFound {
		t.Skipf("Skipping test due to missing `MONGODB_ATLAS_PUBLIC_KEY` environment variable")
	}

	_, privateKeyFound := os.LookupEnv("MONGODB_ATLAS_PRIVATE_KEY")
	if !privateKeyFound {
		t.Skipf("Skipping test due to missing `MONGODB_ATLAS_PRIVATE_KEY` environment variable")
	}
}

func getMongoDbAtlasOrg(t *testing.T) string {
	orgId, found := os.LookupEnv("MONGODB_ATLAS_ORG_ID")
	if !found {
		t.Skipf("Skipping test due to missing `MONGODB_ATLAS_ORG_ID` environment variable")
	}

	return orgId
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}
