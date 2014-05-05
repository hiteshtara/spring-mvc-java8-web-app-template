package name.dargiri.data.dao;

import name.dargiri.data.model.Model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

/**
 * Created by dionis on 2/3/14.
 */
public abstract class AbstractBaseDAO<T extends Model<ID>, ID extends Serializable> implements BaseDAO<T, ID> {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }
}
