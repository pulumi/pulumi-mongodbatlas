package examples

import (
	"os"
	"testing"

	"github.com/pulumi/pulumi/pkg/v2/testing/integration"
)

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
