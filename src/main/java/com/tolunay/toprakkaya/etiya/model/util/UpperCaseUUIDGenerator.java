package com.tolunay.toprakkaya.etiya.model.util;

import com.tolunay.toprakkaya.etiya.model.seedwork.AbstractEntity;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.UUIDGenerator;

import java.io.Serializable;

/*
 * ID'leri Büyük Harfle Otomatik Atandı.
 *
 * @author Tolunay Toprakkaya
 * @since 31.10.2018
 */
public class UpperCaseUUIDGenerator extends UUIDGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {//SharedSessionContractImplementor
        if (object instanceof AbstractEntity) {
            AbstractEntity abstractEntity = (AbstractEntity) object;
            if (abstractEntity.getId() != null) {
                return abstractEntity.getId();
            }
        }
        Serializable generated = super.generate(session, object);
        return StringUtils.upperCase((String) generated);
    }

}
