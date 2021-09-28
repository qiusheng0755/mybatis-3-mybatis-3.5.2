/**
 *    Copyright 2009-2015 the original author or authors.
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

/**
 * 自定义返回类型, 对返回的结果进行处理，最终得到自己想要的数据格式或类型。
 * 例如：
 * Mapper 方法定义: public void selectGoods(ResultHandler resultHandler);
 * Mapper 方法使用: goodsMapper.selectGoods(resultHandler);
 *
 * @author Clinton Begin
 */
public interface ResultHandler<T> {

  void handleResult(ResultContext<? extends T> resultContext);

}
