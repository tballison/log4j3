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
package org.tallison.log4j3;

/**
 * No-frills, no-surprise, medium-performance logger
 */
public class Logger {

    /**
     * no-op. Seriously?!
     * @param msg
     */
    public static synchronized void trace(String msg) {
        //no-op
    }

    /**
     * no-op. Why do you think System.out was invented?
     * @param msg
     */
    public static synchronized void debug(String msg) {
        //no-op
    }

    public static synchronized void info(String msg) {
        System.out.println(msg);
    }

    public static synchronized void warn(String msg) {
        System.err.println("oh dear: " + msg);
    }

    public static synchronized void error(String msg) {
        System.err.println("my, oh, my: " + msg);
    }

    public static synchronized void fatal(String msg) {
        System.err.println("that's all folks: " + msg);
    }

}
