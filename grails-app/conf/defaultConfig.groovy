serverName = 'http://localhost:8080'
grails.serverURL = 'http://localhost:8080/collectory'
security.cas.bypass = true
security.apikey.checkEnabled = false
workDir='/data/dwc-archive/work'
gbifApiUrl='http://api.gbif.org/v1'
uploadFilePath='/data/collectory-plugin/upload'
google.apikey = "PLEASE_SPECIFY_IN_CONFIG_FILE"
institution.codeLoaderURL='file:/data/collectory/bootstrap/institution_codes.xml'
gbifRegistrationRole = "ROLE_GBIF_REGISTRATION"
gbifRegistrationDryRun = true

cartodb.pattern = 'http://{s}.api.cartocdn.com/light_all/{z}/{x}/{y}.png'

dataResourceChartsJSON = "['country','state','species_group','assertions','type_status','year','month']"
dataProviderChartsJSON = "['country','state','species_group','assertions','type_status','year','month']"
collectionChartsJSON  = "['country','state','species_group','assertions','type_status','year','month']"
institutionChartsJSON  = "['country','state','species_group','assertions','type_status','year','month']"

// Location of locality keywords (null for default)
gbifLicenceMappingUrl = this.class.getResource("/default-gbif-licence-mapping.json").toString()
