package org.fixprotocol.fields.schema;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.core.report.ProcessingReport;
import com.github.fge.jsonschema.examples.Utils;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

public abstract class AbstractFieldsSchemaValidator {
	
	private String jsonSchemaFile;
	private String jsonFixFieldsFile;
	
	@Test
	public void validate() throws IOException, ProcessingException{
		
		System.out.println("toto");
		getJsonFixFieldsFile();
		getJsonSchemaFile();
		
        final JsonNode fstabSchema = Utils.loadResource("/fstab.json");
        final JsonNode good = Utils.loadResource("/fstab-good.json");


        final JsonSchemaFactory factory = JsonSchemaFactory.byDefault();

        final JsonSchema schema = factory.getJsonSchema(fstabSchema);

        ProcessingReport report;

        report = schema.validate(good);
        System.out.println(report);
		
        Assertions.assertTrue(report.isSuccess());
	}
	
	protected void setJsonSchemaFile(final String jsonSchemaFile){
		this.jsonSchemaFile = jsonSchemaFile;
		
	}
	protected void setJsonFixFieldsFile(final String jsonFixFieldsFile){
		this.jsonFixFieldsFile = jsonFixFieldsFile;
	}
	
	protected String getJsonSchemaFile(){
		return this.jsonSchemaFile;
	}
	
	protected String getJsonFixFieldsFile(){
		return this.jsonFixFieldsFile;
	}

}
