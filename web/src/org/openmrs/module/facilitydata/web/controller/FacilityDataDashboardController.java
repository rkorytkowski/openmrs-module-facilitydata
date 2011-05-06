/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.facilitydata.web.controller;

import java.util.List;

import org.openmrs.api.context.Context;
import org.openmrs.module.facilitydata.model.FacilityDataForm;
import org.openmrs.module.facilitydata.service.FacilityDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FacilityDataDashboardController {
    
	@RequestMapping("/module/facilitydata/dashboard.list")
    public void listSchemas(ModelMap map) {
        FacilityDataService svc = Context.getService(FacilityDataService.class);
        List<FacilityDataForm> forms = svc.getAllFacilityDataForms();
        map.addAttribute("forms", forms);
    }
}