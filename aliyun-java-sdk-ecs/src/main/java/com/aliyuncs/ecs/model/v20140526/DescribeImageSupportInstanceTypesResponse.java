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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeImageSupportInstanceTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageSupportInstanceTypesResponse extends AcsResponse {

	private String requestId;

	private String regionId;

	private String imageId;

	private List<InstanceType> instanceTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizRegionId() {
		return this.regionId;
	}

	public void setBizRegionId(String regionId) {
		this.regionId = regionId;
	}

	/**
	 * @deprecated use getBizRegionId instead of this.
	 */
	@Deprecated
	public String getRegionId() {
		return this.regionId;
	}

	/**
	 * @deprecated use setBizRegionId instead of this.
	 */
	@Deprecated
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public List<InstanceType> getInstanceTypes() {
		return this.instanceTypes;
	}

	public void setInstanceTypes(List<InstanceType> instanceTypes) {
		this.instanceTypes = instanceTypes;
	}

	public static class InstanceType {

		private String instanceTypeId;

		private Integer cpuCoreCount;

		private Float memorySize;

		private String instanceTypeFamily;

		public String getInstanceTypeId() {
			return this.instanceTypeId;
		}

		public void setInstanceTypeId(String instanceTypeId) {
			this.instanceTypeId = instanceTypeId;
		}

		public Integer getCpuCoreCount() {
			return this.cpuCoreCount;
		}

		public void setCpuCoreCount(Integer cpuCoreCount) {
			this.cpuCoreCount = cpuCoreCount;
		}

		public Float getMemorySize() {
			return this.memorySize;
		}

		public void setMemorySize(Float memorySize) {
			this.memorySize = memorySize;
		}

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}
	}

	@Override
	public DescribeImageSupportInstanceTypesResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageSupportInstanceTypesResponseUnmarshaller.unmarshall(this, context);
	}
}
