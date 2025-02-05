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
import com.aliyuncs.webplus.transform.v20190320.ValidateConfigSettingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ValidateConfigSettingResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<ConfigValidationResult> configValidationResults;

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

	public List<ConfigValidationResult> getConfigValidationResults() {
		return this.configValidationResults;
	}

	public void setConfigValidationResults(List<ConfigValidationResult> configValidationResults) {
		this.configValidationResults = configValidationResults;
	}

	public static class ConfigValidationResult {

		private String pathName;

		private String optionName;

		private String resultSeverity;

		private String resultMessage;

		private ConfigOption configOption;

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

		public String getResultSeverity() {
			return this.resultSeverity;
		}

		public void setResultSeverity(String resultSeverity) {
			this.resultSeverity = resultSeverity;
		}

		public String getResultMessage() {
			return this.resultMessage;
		}

		public void setResultMessage(String resultMessage) {
			this.resultMessage = resultMessage;
		}

		public ConfigOption getConfigOption() {
			return this.configOption;
		}

		public void setConfigOption(ConfigOption configOption) {
			this.configOption = configOption;
		}

		public static class ConfigOption {

			private String pathName;

			private String optionName;

			private String valueType;

			private String defaultValue;

			private String changeSeverity;

			private String optionDescription;

			private Integer maxLength;

			private Long maxValue;

			private Long minValue;

			private String regexPattern;

			private String regexDesc;

			private String optionLabel;

			private Integer minLength;

			private String editorType;

			private String valueOptions;

			private Boolean hiddenOption;

			private Boolean readonlyOption;

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

			public String getOptionLabel() {
				return this.optionLabel;
			}

			public void setOptionLabel(String optionLabel) {
				this.optionLabel = optionLabel;
			}

			public Integer getMinLength() {
				return this.minLength;
			}

			public void setMinLength(Integer minLength) {
				this.minLength = minLength;
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

			public Boolean getHiddenOption() {
				return this.hiddenOption;
			}

			public void setHiddenOption(Boolean hiddenOption) {
				this.hiddenOption = hiddenOption;
			}

			public Boolean getReadonlyOption() {
				return this.readonlyOption;
			}

			public void setReadonlyOption(Boolean readonlyOption) {
				this.readonlyOption = readonlyOption;
			}
		}
	}

	@Override
	public ValidateConfigSettingResponse getInstance(UnmarshallerContext context) {
		return	ValidateConfigSettingResponseUnmarshaller.unmarshall(this, context);
	}
}
