package com.tanwika.api.exceptions;


public enum ErrorCode {
  // Internal Errors: 1 to 0999
  GENERIC_ERROR("TANU-0001", "The system is unable to complete the request. Contact system support."),
  HTTP_MEDIATYPE_NOT_SUPPORTED("TANU-0002", "Requested media type is not supported. Please use application/json or application/xml as 'Content-Type' header value"),
  HTTP_MESSAGE_NOT_WRITABLE("TANU-0003", "Missing 'Accept' header. Please add 'Accept' header."),
  HTTP_MEDIA_TYPE_NOT_ACCEPTABLE("TANU-0004", "Requested 'Accept' header value is not supported. Please use application/json or application/xml as 'Accept' value"),
  JSON_PARSE_ERROR("TANU-0005", "Make sure request payload should be a valid JSON object."),
  HTTP_MESSAGE_NOT_READABLE("TANU-0006", "Make sure request payload should be a valid JSON or XML object according to 'Content-Type'.");

  private String errCode;
  private String errMsgKey;

  ErrorCode(final String errCode, final String errMsgKey) {
    this.errCode = errCode;
    this.errMsgKey = errMsgKey;
  }

  public String getErrCode() {
    return errCode;
  }

  public String getErrMsgKey() {
    return errMsgKey;
  }
}