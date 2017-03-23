package com.waitou.towards.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LOGO_IMG".
*/
public class LogoImgDao extends AbstractDao<LogoImg, Long> {

    public static final String TABLENAME = "LOGO_IMG";

    /**
     * Properties of entity LogoImg.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property ImgUrl = new Property(1, String.class, "imgUrl", false, "IMG_URL");
        public final static Property SavePath = new Property(2, String.class, "savePath", false, "SAVE_PATH");
        public final static Property IsShowLogoUrl = new Property(3, boolean.class, "isShowLogoUrl", false, "IS_SHOW_LOGO_URL");
    }


    public LogoImgDao(DaoConfig config) {
        super(config);
    }
    
    public LogoImgDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LOGO_IMG\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"IMG_URL\" TEXT NOT NULL ," + // 1: imgUrl
                "\"SAVE_PATH\" TEXT," + // 2: savePath
                "\"IS_SHOW_LOGO_URL\" INTEGER NOT NULL );"); // 3: isShowLogoUrl
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LOGO_IMG\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, LogoImg entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getImgUrl());
 
        String savePath = entity.getSavePath();
        if (savePath != null) {
            stmt.bindString(3, savePath);
        }
        stmt.bindLong(4, entity.getIsShowLogoUrl() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, LogoImg entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getImgUrl());
 
        String savePath = entity.getSavePath();
        if (savePath != null) {
            stmt.bindString(3, savePath);
        }
        stmt.bindLong(4, entity.getIsShowLogoUrl() ? 1L: 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public LogoImg readEntity(Cursor cursor, int offset) {
        LogoImg entity = new LogoImg( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // imgUrl
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // savePath
            cursor.getShort(offset + 3) != 0 // isShowLogoUrl
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, LogoImg entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setImgUrl(cursor.getString(offset + 1));
        entity.setSavePath(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setIsShowLogoUrl(cursor.getShort(offset + 3) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(LogoImg entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(LogoImg entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(LogoImg entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
