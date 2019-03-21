/*
 *  Copyright huangqun Holding Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.hq.llytx.core.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: huangqun
 * @Date: 2019/3/20
 * @Version 1.0.0
 */
public class TxEventHis implements Serializable {

	private static final long serialVersionUID = -1270123283198599731L;

	private Long id;

	private String appId;

	private String processId;

	private int status;

	private String txType;

	private int executeTimes;

	private int reverseLookupSwitch;

	private String latestExecuteTrace;

	private Date createTime;

	private Date modifyTime;
}
