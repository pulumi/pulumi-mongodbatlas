//go:build !go && !nodejs && !python && !dotnet
// +build !go,!nodejs,!python,!dotnet

// Copyright 2016-2024, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License")
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//	http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package mongodbatlas

import (
	"os"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/opttest"
)

const providerName = "mongodbatlas"

func testProgram(t *testing.T, dir string) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	test := pulumitest.NewPulumiTest(t, dir,
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
		opttest.SkipInstall(),
	)
	test.Up()
}

func TestPrograms(t *testing.T) {
	programs := []string{
		"test-programs/index_databaseuser",
		"test-programs/index_cluster",
		"test-programs/index_project",
		"test-programs/index_projectipaccesslist",
		"test-programs/index_networkpeering",
		"test-programs/index_networkcontainer",
		"test-programs/index_privatelinkendpoint",
		"test-programs/index_privatelinkendpointservice",
		"test-programs/index_serverlessinstance",
		"test-programs/index_cloudbackupschedule",
		"test-programs/index_cloudprovideraccessauthorization",
		"test-programs/index_eventtrigger",
		"test-programs/index_cloudprovideraccesssetup",
		"test-programs/index_searchindex",
		"test-programs/index_team",
		"test-programs/index_thirdpartyintegration",
		"test-programs/index_advancedcluster",
		"test-programs/index_customdbrole",
		"test-programs/index_alertconfiguration",
		"test-programs/index_maintenancewindow",
	}
	for _, p := range programs {
		t.Run(p, func(t *testing.T) {
			testProgram(t, p)
		})
	}
}
