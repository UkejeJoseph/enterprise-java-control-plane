/*
 * Copyright (c) 2026-present The Aspectran Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aspectran.aspectow.console.build.bridge;

/**
 * Interface representing a client session for build/deploy communications.
 *
 * <p>Created: 2026-08-18</p>
 */
public interface BuildDeploySession {

    /**
     * Returns the unique session ID.
     * @return the session ID
     */
    String getSessionId();

    /**
     * Returns the node ID associated with this session.
     * @return the node ID
     */
    String getNodeId();

    /**
     * Sets the node ID associated with this session.
     * @param nodeId the node ID
     */
    void setNodeId(String nodeId);

}
