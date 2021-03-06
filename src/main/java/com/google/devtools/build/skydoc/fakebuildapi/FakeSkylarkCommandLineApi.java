// Copyright 2018 The Bazel Authors. All rights reserved.
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

package com.google.devtools.build.skydoc.fakebuildapi;

import com.google.devtools.build.lib.skylarkbuildapi.SkylarkCommandLineApi;
import com.google.devtools.build.lib.syntax.SkylarkNestedSet;

/**
 * Fake implementation of {@link SkylarkCommandLineApi}.
 */
public class FakeSkylarkCommandLineApi implements SkylarkCommandLineApi {

  @Override
  public String joinPaths(String separator, SkylarkNestedSet files) {
    return "";
  }
}
