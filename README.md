# OpenFHIR Plugin API

A plugin API for converting between OpenEHR and FHIR healthcare data formats. This library provides extension points for implementing format converters in OpenFHIR.

## Overview

This API defines the extension points for plugins that convert between OpenEHR and FHIR formats, enabling interoperability between healthcare systems that use different data standards.

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

- `String toFHIR(String openEhrData)`: Convert OpenEHR data to FHIR format
- `String toOpenEHR(String fhirData)`: Convert FHIR data to OpenEHR format
- `boolean applyFhirToOpenEhrMapping(...)`: Apply specific mapping functions for FHIR to OpenEHR conversion
- `Object applyOpenEhrToFhirMapping(...)`: Apply specific mapping functions for OpenEHR to FHIR conversion

## Dependencies

- [PF4J](https://github.com/pf4j/pf4j) - Plugin Framework for Java
- [HAPI FHIR](https://hapifhir.io/) - Java API for FHIR
- [Gson](https://github.com/google/gson) - JSON processing library

## Publishing to Maven Central

This project is configured to be published to Maven Central. Follow these steps to publish:

### Prerequisites

1. Create a Sonatype OSSRH account at [Sonatype JIRA](https://issues.sonatype.org/)
2. Set up GPG for signing artifacts
3. Configure your Maven `settings.xml` (use the provided `settings.xml.template` as a guide)

### Deployment Steps

#### For Snapshot Versions

To deploy a snapshot version (version ending with `-SNAPSHOT`):

```bash
mvn clean deploy
```

#### For Release Versions

To perform a release deployment:

1. Prepare the release:

```bash
mvn release:clean release:prepare
```

2. Perform the release:

```bash
mvn release:perform
```

Alternatively, for a manual release:

1. Update versions in POM files to non-snapshot version:

```bash
mvn versions:set -DnewVersion=1.0.0
```

2. Deploy with the release profile:

```bash
mvn clean deploy -P release
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## Support

For support or questions, please open an issue in the GitHub repository.
