package test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


import com.github.jsonldjava.jena.JenaJSONLD;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import org.apache.jena.riot.RDFDataMgr;

public class Test1 {

  static {
	JenaJSONLD.init();
  }

  public static void main(String[] args) throws Exception {
        final Model model = ModelFactory.createDefaultModel();
        String jsonld = " { '@id': 'test', \n" + "   'http://example.com/value': 'Test' \n }  ";
        jsonld = jsonld.replace('\'', '"');
        final InputStream in = new ByteArrayInputStream(jsonld.getBytes("utf8"));

        final String baseUri = "http://example.com/";
        model.read(in, baseUri, "JSON-LD");
        System.out.println("HELLO:");
        //model.write(System.out, "TURTLE", "");
        RDFDataMgr.write(System.out, model, JenaJSONLD.JSONLD);
        System.out.flush();
 }

}
