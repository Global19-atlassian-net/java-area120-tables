/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/area120/tables/v1alpha1/tables.proto

package com.google.area120.tables.v1alpha1;

public interface ColumnDescriptionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.area120.tables.v1alpha1.ColumnDescription)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * column name
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * column name
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Data type of the column
   * Supported types are number, text, boolean, number_list, text_list,
   * boolean_list.
   * </pre>
   *
   * <code>string data_type = 2;</code>
   *
   * @return The dataType.
   */
  java.lang.String getDataType();
  /**
   *
   *
   * <pre>
   * Data type of the column
   * Supported types are number, text, boolean, number_list, text_list,
   * boolean_list.
   * </pre>
   *
   * <code>string data_type = 2;</code>
   *
   * @return The bytes for dataType.
   */
  com.google.protobuf.ByteString getDataTypeBytes();

  /**
   *
   *
   * <pre>
   * Internal id for a column.
   * </pre>
   *
   * <code>string id = 3;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Internal id for a column.
   * </pre>
   *
   * <code>string id = 3;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();
}
