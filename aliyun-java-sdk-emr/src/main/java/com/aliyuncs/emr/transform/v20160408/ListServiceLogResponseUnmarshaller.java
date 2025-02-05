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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListServiceLogResponse;
import com.aliyuncs.emr.model.v20160408.ListServiceLogResponse.LogFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServiceLogResponseUnmarshaller {

	public static ListServiceLogResponse unmarshall(ListServiceLogResponse listServiceLogResponse, UnmarshallerContext _ctx) {
		
		listServiceLogResponse.setRequestId(_ctx.stringValue("ListServiceLogResponse.RequestId"));

		List<LogFile> logFileList = new ArrayList<LogFile>();
		for (int i = 0; i < _ctx.lengthValue("ListServiceLogResponse.LogFileList.Length"); i++) {
			LogFile logFile = new LogFile();
			logFile.setFileName(_ctx.stringValue("ListServiceLogResponse.LogFileList["+ i +"].FileName"));
			logFile.setSize(_ctx.longValue("ListServiceLogResponse.LogFileList["+ i +"].Size"));
			logFile.setHostName(_ctx.stringValue("ListServiceLogResponse.LogFileList["+ i +"].HostName"));
			logFile.setLastModified(_ctx.longValue("ListServiceLogResponse.LogFileList["+ i +"].LastModified"));

			logFileList.add(logFile);
		}
		listServiceLogResponse.setLogFileList(logFileList);
	 
	 	return listServiceLogResponse;
	}
}