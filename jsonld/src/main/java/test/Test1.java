package test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


import com.github.jsonldjava.jena.JenaJSONLD;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class Test1 {

  public static void init() {
	JenaJSONLD.init();
  }

  public static void main(String[] args) throws Exception {
	JenaJSONLD.init();
        final Model model = ModelFactory.createDefaultModel();
        String jsonld = " { '@id': 'test', \n" + "   'http://example.com/value': 'Test' \n }  ";
        jsonld = jsonld.replace('\'', '"');
        final InputStream in = new ByteArrayInputStream(jsonld.getBytes("utf8"));

        final String baseUri = "http://example.com/";
        model.read(in, baseUri, "JSON-LD");
        System.out.println("HELLO:");
        model.write(System.out, "TURTLE", "");
        System.out.flush();
 }

}
