/*
 * Copyright © 2019-2023 Forb Yuan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package win.doyto.query.elasticsearch;

import win.doyto.query.core.DataAccess;
import win.doyto.query.core.DoytoQuery;
import win.doyto.query.core.IdWrapper;
import win.doyto.query.entity.Persistable;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * ESDataAccess
 *
 * @author f0rb on 2023/6/10
 * @since 1.0.2
 */
public class ESDataAccess<E extends Persistable<I>, I extends Serializable, Q extends DoytoQuery> implements DataAccess<E, I, Q> {

    @Override
    public List<E> query(Q q) {
        return Collections.emptyList();
    }

    @Override
    public long count(Q q) {
        return 0;
    }

    @Override
    public <V> List<V> queryColumns(Q q, Class<V> aClass, String... strings) {
        return Collections.emptyList();
    }

    @Override
    public E get(IdWrapper<I> idWrapper) {
        return null;
    }

    @Override
    public int delete(IdWrapper<I> idWrapper) {
        return 0;
    }

    @Override
    public int delete(Q q) {
        return 0;
    }

    @Override
    public void create(E e) {

    }

    @Override
    public int update(E e) {
        return 0;
    }

    @Override
    public int patch(E e) {
        return 0;
    }

    @Override
    public int patch(E e, Q q) {
        return 0;
    }

    @Override
    public List<I> queryIds(Q q) {
        return Collections.emptyList();
    }
}
