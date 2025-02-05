/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.csb.transform.v20171118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csb.model.v20171118.GetServiceResponse;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service.RouteConf;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service.RouteConf.ImportConf;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameter;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameter;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service.RouteConf.ImportConfs;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameter3;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameter4;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service.ServiceVersion;
import com.aliyuncs.csb.model.v20171118.GetServiceResponse.Data.Service.VisiableGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceResponseUnmarshaller {

	public static GetServiceResponse unmarshall(GetServiceResponse getServiceResponse, UnmarshallerContext _ctx) {
		
		getServiceResponse.setRequestId(_ctx.stringValue("GetServiceResponse.RequestId"));
		getServiceResponse.setCode(_ctx.integerValue("GetServiceResponse.Code"));
		getServiceResponse.setMessage(_ctx.stringValue("GetServiceResponse.Message"));

		Data data = new Data();

		Service service = new Service();
		service.setAccessParamsJSON(_ctx.stringValue("GetServiceResponse.Data.Service.AccessParamsJSON"));
		service.setActive(_ctx.booleanValue("GetServiceResponse.Data.Service.Active"));
		service.setAlias(_ctx.stringValue("GetServiceResponse.Data.Service.Alias"));
		service.setAllVisiable(_ctx.booleanValue("GetServiceResponse.Data.Service.AllVisiable"));
		service.setApproveUserId(_ctx.stringValue("GetServiceResponse.Data.Service.ApproveUserId"));
		service.setCasTargets(_ctx.stringValue("GetServiceResponse.Data.Service.CasTargets"));
		service.setConsumeTypesJSON(_ctx.stringValue("GetServiceResponse.Data.Service.ConsumeTypesJSON"));
		service.setCreateTime(_ctx.longValue("GetServiceResponse.Data.Service.CreateTime"));
		service.setCsbId(_ctx.longValue("GetServiceResponse.Data.Service.CsbId"));
		service.setErrDefJSON(_ctx.stringValue("GetServiceResponse.Data.Service.ErrDefJSON"));
		service.setId(_ctx.longValue("GetServiceResponse.Data.Service.Id"));
		service.setInterfaceName(_ctx.stringValue("GetServiceResponse.Data.Service.InterfaceName"));
		service.setIpBlackStr(_ctx.stringValue("GetServiceResponse.Data.Service.IpBlackStr"));
		service.setIpWhiteStr(_ctx.stringValue("GetServiceResponse.Data.Service.IpWhiteStr"));
		service.setModelVersion(_ctx.stringValue("GetServiceResponse.Data.Service.ModelVersion"));
		service.setModifiedTime(_ctx.longValue("GetServiceResponse.Data.Service.ModifiedTime"));
		service.setOldVersion(_ctx.stringValue("GetServiceResponse.Data.Service.OldVersion"));
		service.setOpenRestfulPath(_ctx.stringValue("GetServiceResponse.Data.Service.OpenRestfulPath"));
		service.setOttFlag(_ctx.booleanValue("GetServiceResponse.Data.Service.OttFlag"));
		service.setOwnerId(_ctx.stringValue("GetServiceResponse.Data.Service.OwnerId"));
		service.setPolicyHandler(_ctx.stringValue("GetServiceResponse.Data.Service.PolicyHandler"));
		service.setPrincipalName(_ctx.stringValue("GetServiceResponse.Data.Service.PrincipalName"));
		service.setProjectId(_ctx.longValue("GetServiceResponse.Data.Service.ProjectId"));
		service.setProjectName(_ctx.stringValue("GetServiceResponse.Data.Service.ProjectName"));
		service.setProvideType(_ctx.stringValue("GetServiceResponse.Data.Service.ProvideType"));
		service.setRouteConfJson(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConfJson"));
		service.setSSL(_ctx.booleanValue("GetServiceResponse.Data.Service.SSL"));
		service.setScope(_ctx.stringValue("GetServiceResponse.Data.Service.Scope"));
		service.setServiceName(_ctx.stringValue("GetServiceResponse.Data.Service.ServiceName"));
		service.setServiceOpenRestfulPath(_ctx.stringValue("GetServiceResponse.Data.Service.ServiceOpenRestfulPath"));
		service.setServiceProviderType(_ctx.stringValue("GetServiceResponse.Data.Service.ServiceProviderType"));
		service.setServiceVersion(_ctx.stringValue("GetServiceResponse.Data.Service.ServiceVersion"));
		service.setSkipAuth(_ctx.booleanValue("GetServiceResponse.Data.Service.SkipAuth"));
		service.setStatisticName(_ctx.stringValue("GetServiceResponse.Data.Service.StatisticName"));
		service.setStatus(_ctx.integerValue("GetServiceResponse.Data.Service.Status"));
		service.setUserId(_ctx.stringValue("GetServiceResponse.Data.Service.UserId"));
		service.setValidConsumeTypes(_ctx.booleanValue("GetServiceResponse.Data.Service.ValidConsumeTypes"));
		service.setValidProvideType(_ctx.booleanValue("GetServiceResponse.Data.Service.ValidProvideType"));

		List<String> casServTargets = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Data.Service.CasServTargets.Length"); i++) {
			casServTargets.add(_ctx.stringValue("GetServiceResponse.Data.Service.CasServTargets["+ i +"]"));
		}
		service.setCasServTargets(casServTargets);

		List<String> consumeTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Data.Service.ConsumeTypes.Length"); i++) {
			consumeTypes.add(_ctx.stringValue("GetServiceResponse.Data.Service.ConsumeTypes["+ i +"]"));
		}
		service.setConsumeTypes(consumeTypes);

		RouteConf routeConf = new RouteConf();
		routeConf.setServiceRouteStrategy(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ServiceRouteStrategy"));

		ImportConf importConf = new ImportConf();
		importConf.setAccessEndpointJSON(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.AccessEndpointJSON"));
		importConf.setProvideType(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.ProvideType"));

		List<InputParameter> inputParameterMap = new ArrayList<InputParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap.Length"); i++) {
			InputParameter inputParameter = new InputParameter();
			inputParameter.setCatType(_ctx.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap["+ i +"].CatType"));
			inputParameter.setDepth(_ctx.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap["+ i +"].Depth"));
			inputParameter.setExtType(_ctx.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap["+ i +"].ExtType"));
			inputParameter.setMapStyle(_ctx.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap["+ i +"].MapStyle"));
			inputParameter.setOptional(_ctx.booleanValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap["+ i +"].Optional"));
			inputParameter.setOriginalName(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap["+ i +"].OriginalName"));
			inputParameter.setParamType(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap["+ i +"].ParamType"));
			inputParameter.setPassMethod(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap["+ i +"].PassMethod"));
			inputParameter.setTargetName(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.InputParameterMap["+ i +"].TargetName"));

			inputParameterMap.add(inputParameter);
		}
		importConf.setInputParameterMap(inputParameterMap);

		List<OutputParameter> outputParameterMap = new ArrayList<OutputParameter>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap.Length"); i++) {
			OutputParameter outputParameter = new OutputParameter();
			outputParameter.setCatType(_ctx.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap["+ i +"].CatType"));
			outputParameter.setDepth(_ctx.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap["+ i +"].Depth"));
			outputParameter.setExtType(_ctx.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap["+ i +"].ExtType"));
			outputParameter.setMapStyle(_ctx.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap["+ i +"].MapStyle"));
			outputParameter.setOptional(_ctx.booleanValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap["+ i +"].Optional"));
			outputParameter.setOriginalName(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap["+ i +"].OriginalName"));
			outputParameter.setParamType(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap["+ i +"].ParamType"));
			outputParameter.setPassMethod(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap["+ i +"].PassMethod"));
			outputParameter.setTargetName(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConf.OutputParameterMap["+ i +"].TargetName"));

			outputParameterMap.add(outputParameter);
		}
		importConf.setOutputParameterMap(outputParameterMap);
		routeConf.setImportConf(importConf);

		ImportConfs importConfs = new ImportConfs();
		importConfs.setAccessEndpointJSON(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.AccessEndpointJSON"));
		importConfs.setProvideType(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.ProvideType"));

		List<InputParameter3> inputParameterMap1 = new ArrayList<InputParameter3>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap.Length"); i++) {
			InputParameter3 inputParameter3 = new InputParameter3();
			inputParameter3.setCatType(_ctx.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap["+ i +"].CatType"));
			inputParameter3.setDepth(_ctx.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap["+ i +"].Depth"));
			inputParameter3.setExtType(_ctx.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap["+ i +"].ExtType"));
			inputParameter3.setMapStyle(_ctx.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap["+ i +"].MapStyle"));
			inputParameter3.setOptional(_ctx.booleanValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap["+ i +"].Optional"));
			inputParameter3.setOriginalName(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap["+ i +"].OriginalName"));
			inputParameter3.setParamType(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap["+ i +"].ParamType"));
			inputParameter3.setPassMethod(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap["+ i +"].PassMethod"));
			inputParameter3.setTargetName(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.InputParameterMap["+ i +"].TargetName"));

			inputParameterMap1.add(inputParameter3);
		}
		importConfs.setInputParameterMap1(inputParameterMap1);

		List<OutputParameter4> outputParameterMap2 = new ArrayList<OutputParameter4>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap.Length"); i++) {
			OutputParameter4 outputParameter4 = new OutputParameter4();
			outputParameter4.setCatType(_ctx.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap["+ i +"].CatType"));
			outputParameter4.setDepth(_ctx.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap["+ i +"].Depth"));
			outputParameter4.setExtType(_ctx.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap["+ i +"].ExtType"));
			outputParameter4.setMapStyle(_ctx.integerValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap["+ i +"].MapStyle"));
			outputParameter4.setOptional(_ctx.booleanValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap["+ i +"].Optional"));
			outputParameter4.setOriginalName(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap["+ i +"].OriginalName"));
			outputParameter4.setParamType(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap["+ i +"].ParamType"));
			outputParameter4.setPassMethod(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap["+ i +"].PassMethod"));
			outputParameter4.setTargetName(_ctx.stringValue("GetServiceResponse.Data.Service.RouteConf.ImportConfs.OutputParameterMap["+ i +"].TargetName"));

			outputParameterMap2.add(outputParameter4);
		}
		importConfs.setOutputParameterMap2(outputParameterMap2);
		routeConf.setImportConfs(importConfs);
		service.setRouteConf(routeConf);

		List<ServiceVersion> serviceVersionsList = new ArrayList<ServiceVersion>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Data.Service.ServiceVersionsList.Length"); i++) {
			ServiceVersion serviceVersion = new ServiceVersion();
			serviceVersion.setActive(_ctx.booleanValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].Active"));
			serviceVersion.setAllVisiable(_ctx.booleanValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].AllVisiable"));
			serviceVersion.setId(_ctx.longValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].Id"));
			serviceVersion.setOldVersion(_ctx.stringValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].OldVersion"));
			serviceVersion.setOttFlag(_ctx.booleanValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].OttFlag"));
			serviceVersion.setSSL(_ctx.booleanValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].SSL"));
			serviceVersion.setScope(_ctx.stringValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].Scope"));
			serviceVersion.setServiceVersion(_ctx.stringValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].ServiceVersion"));
			serviceVersion.setSkipAuth(_ctx.booleanValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].SkipAuth"));
			serviceVersion.setStatisticName(_ctx.stringValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].StatisticName"));
			serviceVersion.setStatus(_ctx.integerValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].Status"));
			serviceVersion.setValidConsumeTypes(_ctx.booleanValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].ValidConsumeTypes"));
			serviceVersion.setValidProvideType(_ctx.booleanValue("GetServiceResponse.Data.Service.ServiceVersionsList["+ i +"].ValidProvideType"));

			serviceVersionsList.add(serviceVersion);
		}
		service.setServiceVersionsList(serviceVersionsList);

		List<VisiableGroup> visiableGroupList = new ArrayList<VisiableGroup>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.Data.Service.VisiableGroupList.Length"); i++) {
			VisiableGroup visiableGroup = new VisiableGroup();
			visiableGroup.setId(_ctx.longValue("GetServiceResponse.Data.Service.VisiableGroupList["+ i +"].Id"));
			visiableGroup.setGroupId(_ctx.longValue("GetServiceResponse.Data.Service.VisiableGroupList["+ i +"].GroupId"));
			visiableGroup.setUserId(_ctx.stringValue("GetServiceResponse.Data.Service.VisiableGroupList["+ i +"].UserId"));
			visiableGroup.setServiceId(_ctx.longValue("GetServiceResponse.Data.Service.VisiableGroupList["+ i +"].ServiceId"));
			visiableGroup.setCreateTime(_ctx.longValue("GetServiceResponse.Data.Service.VisiableGroupList["+ i +"].CreateTime"));
			visiableGroup.setModifiedTime(_ctx.longValue("GetServiceResponse.Data.Service.VisiableGroupList["+ i +"].ModifiedTime"));
			visiableGroup.setStatus(_ctx.integerValue("GetServiceResponse.Data.Service.VisiableGroupList["+ i +"].Status"));

			visiableGroupList.add(visiableGroup);
		}
		service.setVisiableGroupList(visiableGroupList);
		data.setService(service);
		getServiceResponse.setData(data);
	 
	 	return getServiceResponse;
	}
}