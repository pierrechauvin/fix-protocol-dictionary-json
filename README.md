# fix-protocol-dictionary-json
This repository hosts a set of JSON-formatted files containing the allowed FIX (Financial Information eXchange) fields, depending of the FIX protocol version.

These JSON files are build and maintained based on the work made by the FIX community:

FIXT 1.1: [TODO][Google][1]
FIX 4.0: [TODO]
FIX 4.1: [TODO]
FIX 4.2: [TODO]
FIX 4.3: [TODO]
FIX 4.4: [TODO]
FIX 5.0: [TODO]
FIX 5.0 SP1: [TODO]
FIX 5.0 SP2: [TODO]

For each FIX protocol version, two files are proposed:
A "simplified" array of the fields, sorted by their tag number, containing the following values: Tag, Field Name, Type
An "extended" array of the fields, sorted by their tag number, containing the following values: Tag, Field Name, Type, Description, [TODO]. This file is in average larger by [TODO]% of the "simplified" version.

All JSON-formatted files complies with the standardization proposal from Google [TODO] and RFCxxx [TODO]. Fields names and descriptions are provided in English, and all files are encoded in UTF-8 [TODO].
A JSON schema defined in [TODO] allows to validate these files.

As an exemple, project [TODO] provides a FIX message parser that use all JSON representation of the FIX protocol fields in order to provide a contextual set of information related to each tag present in a given FIX message.

[1]: http://google.com/        "Google"
