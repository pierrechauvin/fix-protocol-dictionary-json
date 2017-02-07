# fix-protocol-dictionary-json
This repository hosts a set of JSON-formatted files containing the allowed FIX (Financial Information eXchange) fields, depending of the FIX protocol version.

These JSON files are build and maintained based on the work made by the FIX community ():

- FIXT 1.1: [Google][1]
- FIX 4.0: [Google][2]
- FIX 4.1: [Google][3]
- FIX 4.2: [Google][4]
- FIX 4.3: [Google][5]
- FIX 4.4: [Google][6]
- FIX 5.0: [Google][7]
- FIX 5.0 SP1: [Google][8]
- FIX 5.0 SP2: [Google][9]

For each FIX protocol version, two files are proposed:
- A "simplified" array of FIX fields, sorted by their tag identifier, containing the following values: Tag, Field Name, Type.
- An "extended" array of FIX fields, sorted by their tag identifier, containing the following values: Tag, Field Name, Type, Description, [TODO]. This file is in average larger by [TODO]% of the "simplified" version.

All JSON-formatted files complies with the standardization proposal from Google [TODO] and [IETF RFC 7159]
[RFC7159]. Fields names and descriptions are provided in English, and all files are encoded in UTF-8 [TODO].
A JSON schema defined in [TODO] allows to validate these files.

As an exemple, project [TODO] provides a FIX message parser that use all JSON representation of the FIX protocol fields in order to provide a contextual set of information related to each tag present in a given FIX message.

[1]: http://google.com/        "Google"
[2]: http://google.com/        "Google"
[3]: http://google.com/        "Google"
[4]: http://google.com/        "Google"
[5]: http://google.com/        "Google"
[6]: http://google.com/        "Google"
[7]: http://google.com/        "Google"
[8]: http://google.com/        "Google"
[9]: http://google.com/        "Google"

[RFC7159]: https://tools.ietf.org/html/rfc7159
