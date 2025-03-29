# OpenFHIR Plugin API

A plugin API for converting between OpenEHR and FHIR healthcare data formats. This library provides extension points for implementing format converters in OpenFHIR.

## Overview

This API defines the extension points for plugins that convert between OpenEHR and FHIR formats.

## Requirements

- Java 17 or higher
- Maven 3.6 or higher

## Installation

Add the following dependency to your Maven project:

```xml
<dependency>
    <groupId>com.medblocks</groupId>
    <artifactId>openfhir-plugin-api</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Usage

To implement a format converter plugin, create a class that implements the `FormatConverter` interface:

```java
import com.medblocks.openfhir.conversion.FormatConverter;
import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

@Extension
public class MyFormatConverter implements FormatConverter {
    // Implement the required methods
}
```

### API Methods

- `boolean applyFhirToOpenEhrMapping(...)`: Apply specific mapping functions for FHIR to OpenEHR conversion
- `Object applyOpenEhrToFhirMapping(...)`: Apply specific mapping functions for OpenEHR to FHIR conversion

## Dependencies

- [PF4J](https://github.com/pf4j/pf4j) - Plugin Framework for Java
- [HAPI FHIR](https://hapifhir.io/) - Java API for FHIR
- [Gson](https://github.com/google/gson) - JSON processing library

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## Support

For support or questions, please open an issue in the GitHub repository.
