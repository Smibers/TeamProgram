package com.cps298.chaching;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ContactDao_Impl implements ContactDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Contact> __insertionAdapterOfContact;

  private final SharedSQLiteStatement __preparedStmtOfDeleteContact;

  public ContactDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfContact = new EntityInsertionAdapter<Contact>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `contacts` (`card`,`ownership`,`cardName`,`useCategory`,`fee`,`experation`,`perk`,`cardBrand`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Contact value) {
        stmt.bindLong(1, value.getId());
        if (value.getOwnership() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOwnership());
        }
        if (value.getCardName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCardName());
        }
        if (value.getUseCategory() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUseCategory());
        }
        if (value.getFee() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getFee());
        }
        if (value.getExpiration() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getExpiration());
        }
        if (value.getPerk() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPerk());
        }
        if (value.getCardBrand() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCardBrand());
        }
      }
    };
    this.__preparedStmtOfDeleteContact = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM contacts WHERE card = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertContact(final Contact contact) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfContact.insert(contact);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteContact(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteContact.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteContact.release(_stmt);
    }
  }

  @Override
  public List<Contact> findContact(final String name) {
    final String _sql = "SELECT * FROM contacts WHERE cardName LIKE '%' || ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "card");
      final int _cursorIndexOfOwnership = CursorUtil.getColumnIndexOrThrow(_cursor, "ownership");
      final int _cursorIndexOfCardName = CursorUtil.getColumnIndexOrThrow(_cursor, "cardName");
      final int _cursorIndexOfUseCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "useCategory");
      final int _cursorIndexOfFee = CursorUtil.getColumnIndexOrThrow(_cursor, "fee");
      final int _cursorIndexOfExpiration = CursorUtil.getColumnIndexOrThrow(_cursor, "experation");
      final int _cursorIndexOfPerk = CursorUtil.getColumnIndexOrThrow(_cursor, "perk");
      final int _cursorIndexOfCardBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "cardBrand");
      final List<Contact> _result = new ArrayList<Contact>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Contact _item;
        _item = new Contact();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpOwnership;
        if (_cursor.isNull(_cursorIndexOfOwnership)) {
          _tmpOwnership = null;
        } else {
          _tmpOwnership = _cursor.getString(_cursorIndexOfOwnership);
        }
        _item.setOwnership(_tmpOwnership);
        final String _tmpCardName;
        if (_cursor.isNull(_cursorIndexOfCardName)) {
          _tmpCardName = null;
        } else {
          _tmpCardName = _cursor.getString(_cursorIndexOfCardName);
        }
        _item.setCardName(_tmpCardName);
        final String _tmpUseCategory;
        if (_cursor.isNull(_cursorIndexOfUseCategory)) {
          _tmpUseCategory = null;
        } else {
          _tmpUseCategory = _cursor.getString(_cursorIndexOfUseCategory);
        }
        _item.setUseCategory(_tmpUseCategory);
        final String _tmpFee;
        if (_cursor.isNull(_cursorIndexOfFee)) {
          _tmpFee = null;
        } else {
          _tmpFee = _cursor.getString(_cursorIndexOfFee);
        }
        _item.setFee(_tmpFee);
        final String _tmpExpiration;
        if (_cursor.isNull(_cursorIndexOfExpiration)) {
          _tmpExpiration = null;
        } else {
          _tmpExpiration = _cursor.getString(_cursorIndexOfExpiration);
        }
        _item.setExpiration(_tmpExpiration);
        final String _tmpPerk;
        if (_cursor.isNull(_cursorIndexOfPerk)) {
          _tmpPerk = null;
        } else {
          _tmpPerk = _cursor.getString(_cursorIndexOfPerk);
        }
        _item.setPerk(_tmpPerk);
        final String _tmpCardBrand;
        if (_cursor.isNull(_cursorIndexOfCardBrand)) {
          _tmpCardBrand = null;
        } else {
          _tmpCardBrand = _cursor.getString(_cursorIndexOfCardBrand);
        }
        _item.setCardBrand(_tmpCardBrand);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<Contact>> getAllContacts() {
    final String _sql = "SELECT * FROM contacts";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"contacts"}, false, new Callable<List<Contact>>() {
      @Override
      public List<Contact> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "card");
          final int _cursorIndexOfOwnership = CursorUtil.getColumnIndexOrThrow(_cursor, "ownership");
          final int _cursorIndexOfCardName = CursorUtil.getColumnIndexOrThrow(_cursor, "cardName");
          final int _cursorIndexOfUseCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "useCategory");
          final int _cursorIndexOfFee = CursorUtil.getColumnIndexOrThrow(_cursor, "fee");
          final int _cursorIndexOfExpiration = CursorUtil.getColumnIndexOrThrow(_cursor, "experation");
          final int _cursorIndexOfPerk = CursorUtil.getColumnIndexOrThrow(_cursor, "perk");
          final int _cursorIndexOfCardBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "cardBrand");
          final List<Contact> _result = new ArrayList<Contact>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Contact _item;
            _item = new Contact();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpOwnership;
            if (_cursor.isNull(_cursorIndexOfOwnership)) {
              _tmpOwnership = null;
            } else {
              _tmpOwnership = _cursor.getString(_cursorIndexOfOwnership);
            }
            _item.setOwnership(_tmpOwnership);
            final String _tmpCardName;
            if (_cursor.isNull(_cursorIndexOfCardName)) {
              _tmpCardName = null;
            } else {
              _tmpCardName = _cursor.getString(_cursorIndexOfCardName);
            }
            _item.setCardName(_tmpCardName);
            final String _tmpUseCategory;
            if (_cursor.isNull(_cursorIndexOfUseCategory)) {
              _tmpUseCategory = null;
            } else {
              _tmpUseCategory = _cursor.getString(_cursorIndexOfUseCategory);
            }
            _item.setUseCategory(_tmpUseCategory);
            final String _tmpFee;
            if (_cursor.isNull(_cursorIndexOfFee)) {
              _tmpFee = null;
            } else {
              _tmpFee = _cursor.getString(_cursorIndexOfFee);
            }
            _item.setFee(_tmpFee);
            final String _tmpExpiration;
            if (_cursor.isNull(_cursorIndexOfExpiration)) {
              _tmpExpiration = null;
            } else {
              _tmpExpiration = _cursor.getString(_cursorIndexOfExpiration);
            }
            _item.setExpiration(_tmpExpiration);
            final String _tmpPerk;
            if (_cursor.isNull(_cursorIndexOfPerk)) {
              _tmpPerk = null;
            } else {
              _tmpPerk = _cursor.getString(_cursorIndexOfPerk);
            }
            _item.setPerk(_tmpPerk);
            final String _tmpCardBrand;
            if (_cursor.isNull(_cursorIndexOfCardBrand)) {
              _tmpCardBrand = null;
            } else {
              _tmpCardBrand = _cursor.getString(_cursorIndexOfCardBrand);
            }
            _item.setCardBrand(_tmpCardBrand);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<Contact> getAllContactsASC() {
    final String _sql = "SELECT * FROM contacts ORDER BY cardName ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "card");
      final int _cursorIndexOfOwnership = CursorUtil.getColumnIndexOrThrow(_cursor, "ownership");
      final int _cursorIndexOfCardName = CursorUtil.getColumnIndexOrThrow(_cursor, "cardName");
      final int _cursorIndexOfUseCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "useCategory");
      final int _cursorIndexOfFee = CursorUtil.getColumnIndexOrThrow(_cursor, "fee");
      final int _cursorIndexOfExpiration = CursorUtil.getColumnIndexOrThrow(_cursor, "experation");
      final int _cursorIndexOfPerk = CursorUtil.getColumnIndexOrThrow(_cursor, "perk");
      final int _cursorIndexOfCardBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "cardBrand");
      final List<Contact> _result = new ArrayList<Contact>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Contact _item;
        _item = new Contact();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpOwnership;
        if (_cursor.isNull(_cursorIndexOfOwnership)) {
          _tmpOwnership = null;
        } else {
          _tmpOwnership = _cursor.getString(_cursorIndexOfOwnership);
        }
        _item.setOwnership(_tmpOwnership);
        final String _tmpCardName;
        if (_cursor.isNull(_cursorIndexOfCardName)) {
          _tmpCardName = null;
        } else {
          _tmpCardName = _cursor.getString(_cursorIndexOfCardName);
        }
        _item.setCardName(_tmpCardName);
        final String _tmpUseCategory;
        if (_cursor.isNull(_cursorIndexOfUseCategory)) {
          _tmpUseCategory = null;
        } else {
          _tmpUseCategory = _cursor.getString(_cursorIndexOfUseCategory);
        }
        _item.setUseCategory(_tmpUseCategory);
        final String _tmpFee;
        if (_cursor.isNull(_cursorIndexOfFee)) {
          _tmpFee = null;
        } else {
          _tmpFee = _cursor.getString(_cursorIndexOfFee);
        }
        _item.setFee(_tmpFee);
        final String _tmpExpiration;
        if (_cursor.isNull(_cursorIndexOfExpiration)) {
          _tmpExpiration = null;
        } else {
          _tmpExpiration = _cursor.getString(_cursorIndexOfExpiration);
        }
        _item.setExpiration(_tmpExpiration);
        final String _tmpPerk;
        if (_cursor.isNull(_cursorIndexOfPerk)) {
          _tmpPerk = null;
        } else {
          _tmpPerk = _cursor.getString(_cursorIndexOfPerk);
        }
        _item.setPerk(_tmpPerk);
        final String _tmpCardBrand;
        if (_cursor.isNull(_cursorIndexOfCardBrand)) {
          _tmpCardBrand = null;
        } else {
          _tmpCardBrand = _cursor.getString(_cursorIndexOfCardBrand);
        }
        _item.setCardBrand(_tmpCardBrand);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Contact> getAllContactsDESC() {
    final String _sql = "SELECT * FROM contacts ORDER BY cardName DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "card");
      final int _cursorIndexOfOwnership = CursorUtil.getColumnIndexOrThrow(_cursor, "ownership");
      final int _cursorIndexOfCardName = CursorUtil.getColumnIndexOrThrow(_cursor, "cardName");
      final int _cursorIndexOfUseCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "useCategory");
      final int _cursorIndexOfFee = CursorUtil.getColumnIndexOrThrow(_cursor, "fee");
      final int _cursorIndexOfExpiration = CursorUtil.getColumnIndexOrThrow(_cursor, "experation");
      final int _cursorIndexOfPerk = CursorUtil.getColumnIndexOrThrow(_cursor, "perk");
      final int _cursorIndexOfCardBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "cardBrand");
      final List<Contact> _result = new ArrayList<Contact>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Contact _item;
        _item = new Contact();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpOwnership;
        if (_cursor.isNull(_cursorIndexOfOwnership)) {
          _tmpOwnership = null;
        } else {
          _tmpOwnership = _cursor.getString(_cursorIndexOfOwnership);
        }
        _item.setOwnership(_tmpOwnership);
        final String _tmpCardName;
        if (_cursor.isNull(_cursorIndexOfCardName)) {
          _tmpCardName = null;
        } else {
          _tmpCardName = _cursor.getString(_cursorIndexOfCardName);
        }
        _item.setCardName(_tmpCardName);
        final String _tmpUseCategory;
        if (_cursor.isNull(_cursorIndexOfUseCategory)) {
          _tmpUseCategory = null;
        } else {
          _tmpUseCategory = _cursor.getString(_cursorIndexOfUseCategory);
        }
        _item.setUseCategory(_tmpUseCategory);
        final String _tmpFee;
        if (_cursor.isNull(_cursorIndexOfFee)) {
          _tmpFee = null;
        } else {
          _tmpFee = _cursor.getString(_cursorIndexOfFee);
        }
        _item.setFee(_tmpFee);
        final String _tmpExpiration;
        if (_cursor.isNull(_cursorIndexOfExpiration)) {
          _tmpExpiration = null;
        } else {
          _tmpExpiration = _cursor.getString(_cursorIndexOfExpiration);
        }
        _item.setExpiration(_tmpExpiration);
        final String _tmpPerk;
        if (_cursor.isNull(_cursorIndexOfPerk)) {
          _tmpPerk = null;
        } else {
          _tmpPerk = _cursor.getString(_cursorIndexOfPerk);
        }
        _item.setPerk(_tmpPerk);
        final String _tmpCardBrand;
        if (_cursor.isNull(_cursorIndexOfCardBrand)) {
          _tmpCardBrand = null;
        } else {
          _tmpCardBrand = _cursor.getString(_cursorIndexOfCardBrand);
        }
        _item.setCardBrand(_tmpCardBrand);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
