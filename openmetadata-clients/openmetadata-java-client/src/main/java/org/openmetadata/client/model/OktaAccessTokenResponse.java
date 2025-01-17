/*
 *  Copyright 2021 Collate
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.openmetadata.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

public class OktaAccessTokenResponse {
  @JsonProperty("token_type")
  private String tokenType = null;

  @JsonProperty("expires_in")
  private Long expiresIn = null;

  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("scope")
  private String scope = null;

  /**
   * Get TokenType
   *
   * @return TokenType
   */
  @Schema(description = "")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String description) {
    this.tokenType = description;
  }

  public OktaAccessTokenResponse withTokenType(String displayName) {
    this.tokenType = displayName;
    return this;
  }

  /**
   * Get ExpiresIn
   *
   * @return ExpiresIn
   */
  @Schema(description = "")
  public Long getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Long iExpiresIn) {
    this.expiresIn = iExpiresIn;
  }

  public OktaAccessTokenResponse withExpiresIn(Long iExpiresIn) {
    this.expiresIn = iExpiresIn;
    return this;
  }

  /**
   * Get AccessToken
   *
   * @return AccessToken
   */
  @Schema(description = "")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String iAccessToken) {
    this.accessToken = iAccessToken;
  }

  public OktaAccessTokenResponse withAccessToken(String iAccessToken) {
    this.accessToken = iAccessToken;
    return this;
  }

  /**
   * Get Scope
   *
   * @return Scope
   */
  @Schema(description = "")
  public String getScope() {
    return scope;
  }

  public void setScope(String iScopes) {
    this.scope = iScopes;
  }

  public OktaAccessTokenResponse withScope(String iScopes) {
    this.scope = iScopes;
    return this;
  }
}
