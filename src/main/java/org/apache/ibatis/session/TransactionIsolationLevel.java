/**
 *    Copyright 2009-2018 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.session;

import java.sql.Connection;

/**
 * @author Clinton Begin
 */
public enum TransactionIsolationLevel {
  NONE(Connection.TRANSACTION_NONE),
  READ_COMMITTED(Connection.TRANSACTION_READ_COMMITTED),      //提交读，不可重复读，避免不了幻读
  READ_UNCOMMITTED(Connection.TRANSACTION_READ_UNCOMMITTED),  //未提交读，事务可以读取未提交的数据，称为“脏读”
  REPEATABLE_READ(Connection.TRANSACTION_REPEATABLE_READ),    //可重复读，避免不了幻读
  SERIALIZABLE(Connection.TRANSACTION_SERIALIZABLE);          //可串行化，强制事务串行执行

  private final int level;

  TransactionIsolationLevel(int level) {
    this.level = level;
  }

  public int getLevel() {
    return level;
  }
}
