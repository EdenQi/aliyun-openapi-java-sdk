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

package com.aliyuncs.webplus.model.v20190320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.webplus.transform.v20190320.DescribeConfigIndexResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeConfigIndexResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String stackId;

	private String stackName;

	private List<ConfigGroup> configGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
	}

	public String getStackName() {
		return this.stackName;
	}

	public void setStackName(String stackName) {
		this.stackName = stackName;
	}

	public List<ConfigGroup> getConfigGroups() {
		return this.configGroups;
	}

	public void setConfigGroups(List<ConfigGroup> configGroups) {
		this.configGroups = configGroups;
	}

	public static class ConfigGroup {

		private String groupName;

		private String groupLabel;

		private List<ConfigPath> configPaths;

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getGroupLabel() {
			return this.groupLabel;
		}

		public void setGroupLabel(String groupLabel) {
			this.groupLabel = groupLabel;
		}

		public List<ConfigPath> getConfigPaths() {
			return this.configPaths;
		}

		public void setConfigPaths(List<ConfigPath> configPaths) {
			this.configPaths = configPaths;
		}

		public static class ConfigPath {

			private String pathName;

			private String pathLabel;

			private Boolean hiddenPath;

			private List<ConfigOption> configOptions;

			public String getPathName() {
				return this.pathName;
			}

			public void setPathName(String pathName) {
				this.pathName = pathName;
			}

			public String getPathLabel() {
				return this.pathLabel;
			}

			public void setPathLabel(String pathLabel) {
				this.pathLabel = pathLabel;
			}

			public Boolean getHiddenPath() {
				return this.hiddenPath;
			}

			public void setHiddenPath(Boolean hiddenPath) {
				this.hiddenPath = hiddenPath;
			}

			public List<ConfigOption> getConfigOptions() {
				return this.configOptions;
			}

			public void setConfigOptions(List<ConfigOption> configOptions) {
				this.configOptions = configOptions;
			}

			public static class ConfigOption {

				private String pathName;

				private String optionName;

				private String optionLabel;

				private String valueType;

				private String defaultValue;

				private String changeSeverity;

				private String optionDescription;

				private Integer maxLength;

				private Integer minLength;

				private Long maxValue;

				private Long minValue;

				private String regexPattern;

				private String regexDesc;

				private String editorType;

				private String valueOptions;

				private Boolean readonlyOption;

				private Boolean hiddenOption;

				public String getPathName() {
					return this.pathName;
				}

				public void setPathName(String pathName) {
					this.pathName = pathName;
				}

				public String getOptionName() {
					return this.optionName;
				}

				public void setOptionName(String optionName) {
					this.optionName = optionName;
				}

				public String getOptionLabel() {
					return this.optionLabel;
				}

				public void setOptionLabel(String optionLabel) {
					this.optionLabel = optionLabel;
				}

				public String getValueType() {
					return this.valueType;
				}

				public void setValueType(String valueType) {
					this.valueType = valueType;
				}

				public String getDefaultValue() {
					return this.defaultValue;
				}

				public void setDefaultValue(String defaultValue) {
					this.defaultValue = defaultValue;
				}

				public String getChangeSeverity() {
					return this.changeSeverity;
				}

				public void setChangeSeverity(String changeSeverity) {
					this.changeSeverity = changeSeverity;
				}

				public String getOptionDescription() {
					return this.optionDescription;
				}

				public void setOptionDescription(String optionDescription) {
					this.optionDescription = optionDescription;
				}

				public Integer getMaxLength() {
					return this.maxLength;
				}

				public void setMaxLength(Integer maxLength) {
					this.maxLength = maxLength;
				}

				public Integer getMinLength() {
					return this.minLength;
				}

				public void setMinLength(Integer minLength) {
					this.minLength = minLength;
				}

				public Long getMaxValue() {
					return this.maxValue;
				}

				public void setMaxValue(Long maxValue) {
					this.maxValue = maxValue;
				}

				public Long getMinValue() {
					return this.minValue;
				}

				public void setMinValue(Long minValue) {
					this.minValue = minValue;
				}

				public String getRegexPattern() {
					return this.regexPattern;
				}

				public void setRegexPattern(String regexPattern) {
					this.regexPattern = regexPattern;
				}

				public String getRegexDesc() {
					return this.regexDesc;
				}

				public void setRegexDesc(String regexDesc) {
					this.regexDesc = regexDesc;
				}

				public String getEditorType() {
					return this.editorType;
				}

				public void setEditorType(String editorType) {
					this.editorType = editorType;
				}

				public String getValueOptions() {
					return this.valueOptions;
				}

				public void setValueOptions(String valueOptions) {
					this.valueOptions = valueOptions;
				}

				public Boolean getReadonlyOption() {
					return this.readonlyOption;
				}

				public void setReadonlyOption(Boolean readonlyOption) {
					this.readonlyOption = readonlyOption;
				}

				public Boolean getHiddenOption() {
					return this.hiddenOption;
				}

				public void setHiddenOption(Boolean hiddenOption) {
					this.hiddenOption = hiddenOption;
				}
			}
		}
	}

	@Override
	public DescribeConfigIndexResponse getInstance(UnmarshallerContext context) {
		return	DescribeConfigIndexResponseUnmarshaller.unmarshall(this, context);
	}
}
