package com.medblocks.openfhir.plugin.api;


import org.pf4j.ExtensionPoint;
import org.hl7.fhir.r4.model.Resource;
import com.google.gson.JsonObject;

/**
 * Extension point for converting between different healthcare data formats
 */
public interface FormatConverter extends ExtensionPoint {
    
    /**
     * Applies a specific mapping function to convert FHIR data to OpenEHR format
     * 
     * @param mappingCode The code identifying the mapping function to use
     * @param openEhrPath The path to the OpenEHR data element
     * @param fhirValue The FHIR value to convert
     * @param openEhrType The OpenEHR data type
     * @param flatComposition The OpenEHR flat composition to update
     * @return True if mapping was successful, false otherwise
     */
    boolean applyFhirToOpenEhrMapping(String mappingCode, String openEhrPath, Object fhirValue, 
                                     String openEhrType, Object flatComposition);
                                     
    /**
     * Applies a specific mapping function to convert OpenEHR data to FHIR format
     * 
     * @param mappingCode The code identifying the mapping function to use
     * @param openEhrPath The path to the OpenEHR data element in flat format
     * @param flatJsonObject The complete OpenEHR flat JSON object
     * @param fhirPath The path in FHIR where the data should be placed
     * @param targetResource The FHIR resource being populated
     * @return The FHIR object that was created or modified
     */
    Object applyOpenEhrToFhirMapping(String mappingCode, 
                                    String openEhrPath, 
                                    JsonObject flatJsonObject, 
                                    String fhirPath, 
                                    Resource targetResource);
} 