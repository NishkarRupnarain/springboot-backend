package com.Nishkar.springbootbackend.G4L_Reverside.controller;

import com.Nishkar.springbootbackend.G4L_Reverside.model.entity.UserAddress;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.HibernateException;
import org.hibernate.event.spi.*;
import org.hibernate.persister.entity.EntityPersister;

import java.util.Map;
import java.util.Set;

@Slf4j
public class UserAddressController implements PersistEventListener, MergeEventListener, DeleteEventListener, PreLoadEventListener, PreDeleteEventListener, PreUpdateEventListener, PreInsertEventListener, PostLoadEventListener, PostDeleteEventListener, PostUpdateEventListener, PostInsertEventListener {
    @Override
    public void onDelete(DeleteEvent deleteEvent) throws HibernateException {
        Object entity = deleteEvent.getObject();
        if (entity instanceof UserAddress) {
            UserAddress userAddress = (UserAddress) entity;
            //TODO handle logic...
        }

    }

    @Override
    public void onDelete(DeleteEvent deleteEvent, Set set) throws HibernateException {
        Object entity = deleteEvent.getObject();
        if (entity instanceof UserAddress) {
            UserAddress userAddress = (UserAddress) entity;
            //TODO handle logic...
        }

    }

    @Override
    public void onMerge(MergeEvent mergeEvent) throws HibernateException {
        Object entity = mergeEvent.getEntity();
        if (entity instanceof UserAddress) {
            UserAddress userAddress = (UserAddress) entity;
            //TODO handle logic...
        }

    }

    @Override
    public void onMerge(MergeEvent mergeEvent, Map map) throws HibernateException {
        Object entity = mergeEvent.getEntity();
        if (entity instanceof UserAddress) {
            UserAddress userAddress = (UserAddress) entity;
            //TODO handle logic...
        }

    }

    @Override
    public void onPersist(PersistEvent persistEvent) throws HibernateException {
        Object entity = persistEvent.getObject();
        if (entity instanceof UserAddress) {
            UserAddress userAddress = (UserAddress) entity;
            //TODO handle logic...
        }

    }

    @Override
    public void onPersist(PersistEvent persistEvent, Map map) throws HibernateException {
        Object entity = persistEvent.getObject();
        if (entity instanceof UserAddress) {
            UserAddress userAddress = (UserAddress) entity;
            //TODO handle logic...
        }

    }

    @Override
    public void onPostDelete(PostDeleteEvent postDeleteEvent) {
        Object entity = postDeleteEvent.getEntity();
        if (entity instanceof UserAddress) {
            UserAddress userAddress = (UserAddress) entity;
            //TODO handle logic...
        }

    }

    @Override
    public void onPostInsert(PostInsertEvent postInsertEvent) {
        Object entity = postInsertEvent.getEntity();
        if (entity instanceof UserAddress) {
            UserAddress userAddress = (UserAddress) entity;
            //TODO handle logic...
        }

    }

    @Override
    public void onPostUpdate(PostUpdateEvent postUpdateEvent) {
        Object entity = postUpdateEvent.getEntity();
        if (entity instanceof UserAddress) {
            UserAddress userAddress = (UserAddress) entity;
            //TODO handle logic...
        }

    }

    @Override
    public boolean requiresPostCommitHanding(EntityPersister entityPersister) {
        return false;
    }

    @Override
    public void onPostLoad(PostLoadEvent postLoadEvent) {
        Object entity = postLoadEvent.getEntity();
        if (entity instanceof UserAddress) {
            UserAddress userAddress = (UserAddress) entity;
            //TODO handle logic...
        }

    }

    @Override
    public boolean onPreDelete(PreDeleteEvent preDeleteEvent) {
        Object entity = preDeleteEvent.getEntity();
        if (entity instanceof UserAddress) {
            UserAddress userAddress = (UserAddress) entity;
            //TODO handle logic...
        }
        return false;
    }

    @Override
    public boolean onPreInsert(PreInsertEvent preInsertEvent) {
        Object entity = preInsertEvent.getEntity();
        if (entity instanceof UserAddress) {
            UserAddress userAddress = (UserAddress) entity;
            //TODO handle logic...
        }
        return false;
    }

    @Override
    public void onPreLoad(PreLoadEvent preLoadEvent) {
        Object entity = preLoadEvent.getEntity();
        if (entity instanceof UserAddress) {
            UserAddress userAddress = (UserAddress) entity;
            //TODO handle logic...
        }

    }

    @Override
    public boolean onPreUpdate(PreUpdateEvent preUpdateEvent) {
        Object entity = preUpdateEvent.getEntity();
        if (entity instanceof UserAddress) {
            UserAddress userAddress = (UserAddress) entity;
            //TODO handle logic...
        }
        return false;
    }
}