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

package com.aliyuncs.vs.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeVsStreamsPublishListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVsStreamsPublishListResponse extends AcsResponse {

	private String requestId;

	private Integer pageNum;

	private Integer pageSize;

	private Integer totalNum;

	private Integer totalPage;

	private List<LiveStreamPublishInfo> publishInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public List<LiveStreamPublishInfo> getPublishInfo() {
		return this.publishInfo;
	}

	public void setPublishInfo(List<LiveStreamPublishInfo> publishInfo) {
		this.publishInfo = publishInfo;
	}

	public static class LiveStreamPublishInfo {

		private String domainName;

		private String appName;

		private String streamName;

		private String streamUrl;

		private String publishTime;

		private String stopTime;

		private String publishUrl;

		private String clientAddr;

		private String edgeNodeAddr;

		private String publishDomain;

		private String publishType;

		private String transcoded;

		private String transcodeId;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public String getStreamUrl() {
			return this.streamUrl;
		}

		public void setStreamUrl(String streamUrl) {
			this.streamUrl = streamUrl;
		}

		public String getPublishTime() {
			return this.publishTime;
		}

		public void setPublishTime(String publishTime) {
			this.publishTime = publishTime;
		}

		public String getStopTime() {
			return this.stopTime;
		}

		public void setStopTime(String stopTime) {
			this.stopTime = stopTime;
		}

		public String getPublishUrl() {
			return this.publishUrl;
		}

		public void setPublishUrl(String publishUrl) {
			this.publishUrl = publishUrl;
		}

		public String getClientAddr() {
			return this.clientAddr;
		}

		public void setClientAddr(String clientAddr) {
			this.clientAddr = clientAddr;
		}

		public String getEdgeNodeAddr() {
			return this.edgeNodeAddr;
		}

		public void setEdgeNodeAddr(String edgeNodeAddr) {
			this.edgeNodeAddr = edgeNodeAddr;
		}

		public String getPublishDomain() {
			return this.publishDomain;
		}

		public void setPublishDomain(String publishDomain) {
			this.publishDomain = publishDomain;
		}

		public String getPublishType() {
			return this.publishType;
		}

		public void setPublishType(String publishType) {
			this.publishType = publishType;
		}

		public String getTranscoded() {
			return this.transcoded;
		}

		public void setTranscoded(String transcoded) {
			this.transcoded = transcoded;
		}

		public String getTranscodeId() {
			return this.transcodeId;
		}

		public void setTranscodeId(String transcodeId) {
			this.transcodeId = transcodeId;
		}
	}

	@Override
	public DescribeVsStreamsPublishListResponse getInstance(UnmarshallerContext context) {
		return	DescribeVsStreamsPublishListResponseUnmarshaller.unmarshall(this, context);
	}
}
