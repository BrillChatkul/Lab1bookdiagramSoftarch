package creational;

import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadataExporter extends BookMetadataExporter  {
	
	private BookMetadataFormatter formatter = null;
	XMLBookMetadataExporter() throws ParserConfigurationException{
		if(formatter == null) {
			formatter = new XMLBookMetadataFormatter();
		}
	}
	
	@Override
	protected BookMetadataFormatter getFormatter() {
		return formatter;
	}

}
