/**
 * The MIT License
 * 
 * Copyright (c) 2013-2017 Jeevanandam M. (myjeeva.com)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.myjeeva.digitalocean.pojo;

import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Represents Certificate attributes
 * 
 * @author Jeevanandam M. (jeeva@myjeeva.com)
 * 
 * @since v2.12
 */
public class Certificate extends RateLimitBase {

  private static final long serialVersionUID = -7525532097995479493L;

  private String id;

  @Expose
  private String name;

  @SerializedName("not_after")
  private String notAfter;

  @SerializedName("sha1_fingerprint")
  private String sha1Fingerprint;

  @SerializedName("created_at")
  private Date createdDate;

  @Expose
  @SerializedName("private_key")
  private String privateKey;

  @Expose
  @SerializedName("leaf_certificate")
  private String leafCertificate;

  @Expose
  @SerializedName("certificate_chain")
  private String certificateChain;

  /**
   * Default Constructor.
   */
  public Certificate() {
    // default constructor
  }

  /**
   * Constructor for new certificate create request.
   */
  public Certificate(String name, String privateKey, String leafCertificate,
      String certificateChain) {
    this.name = name;
    this.privateKey = privateKey;
    this.leafCertificate = leafCertificate;
    this.certificateChain = certificateChain;
  }

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }

  /**
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the notAfter
   */
  public String getNotAfter() {
    return notAfter;
  }

  /**
   * @param notAfter the notAfter to set
   */
  public void setNotAfter(String notAfter) {
    this.notAfter = notAfter;
  }

  /**
   * @return the sha1Fingerprint
   */
  public String getSha1Fingerprint() {
    return sha1Fingerprint;
  }

  /**
   * @param sha1Fingerprint the sha1Fingerprint to set
   */
  public void setSha1Fingerprint(String sha1Fingerprint) {
    this.sha1Fingerprint = sha1Fingerprint;
  }

  /**
   * @return the createdDate
   */
  public Date getCreatedDate() {
    return createdDate;
  }

  /**
   * @param createdDate the createdDate to set
   */
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  /**
   * @return the privateKey
   */
  public String getPrivateKey() {
    return privateKey;
  }

  /**
   * @param privateKey the privateKey to set
   */
  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  /**
   * @return the leafCertificate
   */
  public String getLeafCertificate() {
    return leafCertificate;
  }

  /**
   * @param leafCertificate the leafCertificate to set
   */
  public void setLeafCertificate(String leafCertificate) {
    this.leafCertificate = leafCertificate;
  }

  /**
   * @return the certificateChain
   */
  public String getCertificateChain() {
    return certificateChain;
  }

  /**
   * @param certificateChain the certificateChain to set
   */
  public void setCertificateChain(String certificateChain) {
    this.certificateChain = certificateChain;
  }

}
