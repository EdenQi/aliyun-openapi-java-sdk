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

import com.aliyuncs.emr.model.v20160408.ListDataSourceSchemaDatabaseResponse;
import com.aliyuncs.emr.model.v20160408.ListDataSourceSchemaDatabaseResponse.Schema;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataSourceSchemaDatabaseResponseUnmarshaller {

	public static ListDataSourceSchemaDatabaseResponse unmarshall(ListDataSourceSchemaDatabaseResponse listDataSourceSchemaDatabaseResponse, UnmarshallerContext _ctx) {
		
		listDataSourceSchemaDatabaseResponse.setRequestId(_ctx.stringValue("ListDataSourceSchemaDatabaseResponse.RequestId"));
		listDataSourceSchemaDatabaseResponse.setDataSourceId(_ctx.stringValue("ListDataSourceSchemaDatabaseResponse.DataSourceId"));

		List<Schema> schemaList = new ArrayList<Schema>();
		for (int i = 0; i < _ctx.lengthValue("ListDataSourceSchemaDatabaseResponse.SchemaList.Length"); i++) {
			Schema schema = new Schema();
			schema.setDbName(_ctx.stringValue("ListDataSourceSchemaDatabaseResponse.SchemaList["+ i +"].DbName"));
			schema.setDbVersion(_ctx.stringValue("ListDataSourceSchemaDatabaseResponse.SchemaList["+ i +"].DbVersion"));
			schema.setDbType(_ctx.stringValue("ListDataSourceSchemaDatabaseResponse.SchemaList["+ i +"].DbType"));

			schemaList.add(schema);
		}
		listDataSourceSchemaDatabaseResponse.setSchemaList(schemaList);
	 
	 	return listDataSourceSchemaDatabaseResponse;
	}
}