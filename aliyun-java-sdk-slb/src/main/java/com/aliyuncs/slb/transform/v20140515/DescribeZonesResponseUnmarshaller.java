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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeZonesResponse;
import com.aliyuncs.slb.model.v20140515.DescribeZonesResponse.Zone;
import com.aliyuncs.slb.model.v20140515.DescribeZonesResponse.Zone.SlaveZone;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeZonesResponseUnmarshaller {

	public static DescribeZonesResponse unmarshall(DescribeZonesResponse describeZonesResponse, UnmarshallerContext _ctx) {
		
		describeZonesResponse.setRequestId(_ctx.stringValue("DescribeZonesResponse.RequestId"));

		List<Zone> zones = new ArrayList<Zone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeZonesResponse.Zones.Length"); i++) {
			Zone zone = new Zone();
			zone.setZoneId(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].ZoneId"));
			zone.setLocalName(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].LocalName"));

			List<SlaveZone> slaveZones = new ArrayList<SlaveZone>();
			for (int j = 0; j < _ctx.lengthValue("DescribeZonesResponse.Zones["+ i +"].SlaveZones.Length"); j++) {
				SlaveZone slaveZone = new SlaveZone();
				slaveZone.setZoneId(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].SlaveZones["+ j +"].ZoneId"));
				slaveZone.setLocalName(_ctx.stringValue("DescribeZonesResponse.Zones["+ i +"].SlaveZones["+ j +"].LocalName"));

				slaveZones.add(slaveZone);
			}
			zone.setSlaveZones(slaveZones);

			zones.add(zone);
		}
		describeZonesResponse.setZones(zones);
	 
	 	return describeZonesResponse;
	}
}