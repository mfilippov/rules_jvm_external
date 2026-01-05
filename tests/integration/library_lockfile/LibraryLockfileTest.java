// Copyright 2024 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package library_lockfile;

import com.google.common.collect.ImmutableList;

/**
 * Test class to verify that maven.library() with lock file works correctly.
 * This class uses Guava's ImmutableList which requires the jar to be
 * properly downloaded via copy_file when using lock files.
 */
public class LibraryLockfileTest {
  public static ImmutableList<String> createList() {
    return ImmutableList.of("hello", "world");
  }
}
