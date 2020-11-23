/*
 * htunnel - A simple HTTP tunnel 
 * https://github.com/nicolas-dutertry/htunnel
 * 
 * Written by Nicolas Dutertry.
 * 
 * This file is provided under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.dutertry.htunnel.server.controller;

import java.nio.channels.SocketChannel;
import java.time.LocalDateTime;

public class ClientConnection {
    private final String id;
    
    private final String ipAddress;
    
    private final LocalDateTime creationDateTime;
    
    private final SocketChannel socketChannel;
    
    public ClientConnection(String id, String ipAddress, LocalDateTime creationDateTime, SocketChannel socketChannel) {
        super();
        this.id = id;
        this.ipAddress = ipAddress;
        this.creationDateTime = creationDateTime;
        this.socketChannel = socketChannel;
    }

    public String getId() {
        return id;
    }

    public String getIpAddress() {
        return ipAddress;
    }
    
    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public SocketChannel getSocketChannel() {
        return socketChannel;
    }
}
