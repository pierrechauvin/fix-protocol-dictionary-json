# JSON-formatted FIX fields
## Description
This repository hosts a set of [JSON][IETF_RFC4627]-formatted files containing the allowed [FIX][FIX] (Financial Information eXchange) fields, depending of the FIX protocol version.

[FIX]: http://www.fixtradingcommunity.org/ "FIX Trading Community"


These JSON files are build and maintained based on the work made by the [FIX Community][FIX]:

* FIXT 1.1: [FIXT 1.1 Fields sorted by Tag number][FIXT11]
* FIX 4.0: [FIXT 4.0 Fields sorted by Tag number][FIX40]
* FIX 4.1: [FIXT 4.1 Fields sorted by Tag number][FIX41]
* FIX 4.2: [FIXT 4.2 Fields sorted by Tag number][FIX42]
* FIX 4.3: [FIXT 4.3 Fields sorted by Tag number][FIX43]
* FIX 4.4: [FIXT 4.4 Fields sorted by Tag number][FIX44]
* FIX 5.0: [FIXT 5.0 Fields sorted by Tag number][FIX50]
* FIX 5.0 SP1: [FIXT 5.0 SP1 Fields sorted by Tag number][FIX50SP1]
* FIX 5.0 SP2: [FIXT 5.0 SP2 Fields sorted by Tag number][FIX50SP2]

[FIXT11]: http://www.fixtradingcommunity.org/FIXimate/FIXimate3.0/en/FIXT.1.1/fields_sorted_by_tagnum.html "FIXT 1.1 Fields sorted by Tag number"
[FIX40]: http://www.fixtradingcommunity.org/FIXimate/FIXimate3.0/en/FIX.4.0/fields_sorted_by_tagnum.html "FIX 4.0 Fields sorted by Tag number"
[FIX41]: http://www.fixtradingcommunity.org/FIXimate/FIXimate3.0/en/FIX.4.1/fields_sorted_by_tagnum.html "FIX 4.1 Fields sorted by Tag number"
[FIX42]: http://www.fixtradingcommunity.org/FIXimate/FIXimate3.0/en/FIX.4.2/fields_sorted_by_tagnum.html "FIX 4.2 Fields sorted by Tag number"
[FIX43]: http://www.fixtradingcommunity.org/FIXimate/FIXimate3.0/en/FIX.4.3/fields_sorted_by_tagnum.html "FIX 4.3 Fields sorted by Tag number"
[FIX44]: http://www.fixtradingcommunity.org/FIXimate/FIXimate3.0/en/FIX.4.4/fields_sorted_by_tagnum.html "FIX 4.4 Fields sorted by Tag number"
[FIX50]: http://www.fixtradingcommunity.org/FIXimate/FIXimate3.0/en/FIX.5.0/fields_sorted_by_tagnum.html "FIX 5.0 Fields sorted by Tag number"
[FIX50SP1]: http://www.fixtradingcommunity.org/FIXimate/FIXimate3.0/en/FIX.5.0SP1/fields_sorted_by_tagnum.html "FIX 5.0 SP1 Fields sorted by Tag number"
[FIX50SP2]: http://www.fixtradingcommunity.org/FIXimate/FIXimate3.0/en/FIX.5.0SP2/fields_sorted_by_tagnum.html "FIX 5.0 SP2 Fields sorted by Tag number"

For each FIX protocol version, one file is proposed. It contains a **"simplified"** array of the fields, sorted by their tag number, and providing the following values: **Tag, Name, Type**

```json
{ "FixVersion":"FIX5.0SP2",
  "Fields":[
    {"Tag":1,"Name":"Account","Type":"String"},
    {"Tag":2,"Name":"AdvId","Type":"String"},
    {"Tag":X,"Name":"YYYYYY","Type":"ZZZZ"}
  ]
}
```

[IETF_RFC4627]: https://www.ietf.org/rfc/rfc4627.txt "IETF RFC-4627 The application/json Media Type for JavaScript Object Notation (JSON)"
[UTF8]: https://en.wikipedia.org/wiki/UTF-8 "UTF-8"

## Versions
* **v2.0.0** (*dev_2.0.0*): 
	* new FIX protocol version (v x.x.x) implementation.
* **v1.1.0** (*dev_1.1.0*):
	* JSON-schema validation
	* Unit tests for JSON schema validation (JDK v x.x.x, Junit v x.x.x)
	* Mavenization (Maven v x.x.x)
	* CDN (Content Delivery Network) usage detailed
* **v1.0.1** (*dev_1.0.1*): 
	* bugfixes and minor changes
* **v1.0.0** (*master*) : current production version.

## Contacts

* Pierre Chauvin (pierre.chauvin[at]gmail.com)
