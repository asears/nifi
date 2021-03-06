/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.processor.exception;

/**
 * Thrown when a flow file is referenced that is not part of the appropriate
 * session or is not properly accounted for by a transfer or removal within a
 * session. In any event this exception indicates a logic or programming error
 * within the processor interacting with the offending session.
 *
 */
public class FlowFileHandlingException extends ProcessException {

    private static final long serialVersionUID = 1L;

    public FlowFileHandlingException(final String message) {
        super(message);
    }

    public FlowFileHandlingException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
