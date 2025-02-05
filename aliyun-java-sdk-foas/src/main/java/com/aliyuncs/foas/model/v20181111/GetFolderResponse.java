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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.foas.transform.v20181111.GetFolderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFolderResponse extends AcsResponse {

	private String requestId;

	private Folder folder;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Folder getFolder() {
		return this.folder;
	}

	public void setFolder(Folder folder) {
		this.folder = folder;
	}

	public static class Folder {

		private Long folderId;

		private String path;

		public Long getFolderId() {
			return this.folderId;
		}

		public void setFolderId(Long folderId) {
			this.folderId = folderId;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}
	}

	@Override
	public GetFolderResponse getInstance(UnmarshallerContext context) {
		return	GetFolderResponseUnmarshaller.unmarshall(this, context);
	}
}
