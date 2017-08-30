/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ohdsi.webapi.service;

import java.io.StringWriter;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.json.JSONWriter;
import org.springframework.stereotype.Component;
import org.ohdsi.featureExtraction.FeatureExtraction;

/**
 *
 * @author asena5
 */
@Path("/feature-extraction/")
@Component
public class FeatureExtractionService extends AbstractDaoService {

	
	@GET
  @Path("/")
  @Produces(MediaType.APPLICATION_JSON)
  public String test() {
		FeatureExtraction.init(null);
		return FeatureExtraction.getDefaultPrespecTemporalAnalyses();
	}
}
