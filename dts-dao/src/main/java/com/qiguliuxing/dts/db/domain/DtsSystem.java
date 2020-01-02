package com.qiguliuxing.dts.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class DtsSystem {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database table dts_system
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	public static final Boolean NOT_DELETED = false;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database table dts_system
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	public static final Boolean IS_DELETED = true;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column dts_system.id
	 *
	 * @mbg.generated
	 */
	private Integer id;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column dts_system.key_name
	 *
	 * @mbg.generated
	 */
	private String keyName;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column dts_system.key_value
	 *
	 * @mbg.generated
	 */
	private String keyValue;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column dts_system.add_time
	 *
	 * @mbg.generated
	 */
	private LocalDateTime addTime;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column dts_system.update_time
	 *
	 * @mbg.generated
	 */
	private LocalDateTime updateTime;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column dts_system.deleted
	 *
	 * @mbg.generated
	 */
	private Boolean deleted;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column dts_system.id
	 *
	 * @return the value of dts_system.id
	 *
	 * @mbg.generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column dts_system.id
	 *
	 * @param id
	 *            the value for dts_system.id
	 *
	 * @mbg.generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column dts_system.key_name
	 *
	 * @return the value of dts_system.key_name
	 *
	 * @mbg.generated
	 */
	public String getKeyName() {
		return keyName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column dts_system.key_name
	 *
	 * @param keyName
	 *            the value for dts_system.key_name
	 *
	 * @mbg.generated
	 */
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column dts_system.key_value
	 *
	 * @return the value of dts_system.key_value
	 *
	 * @mbg.generated
	 */
	public String getKeyValue() {
		return keyValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column dts_system.key_value
	 *
	 * @param keyValue
	 *            the value for dts_system.key_value
	 *
	 * @mbg.generated
	 */
	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column dts_system.add_time
	 *
	 * @return the value of dts_system.add_time
	 *
	 * @mbg.generated
	 */
	public LocalDateTime getAddTime() {
		return addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column dts_system.add_time
	 *
	 * @param addTime
	 *            the value for dts_system.add_time
	 *
	 * @mbg.generated
	 */
	public void setAddTime(LocalDateTime addTime) {
		this.addTime = addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column dts_system.update_time
	 *
	 * @return the value of dts_system.update_time
	 *
	 * @mbg.generated
	 */
	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column dts_system.update_time
	 *
	 * @param updateTime
	 *            the value for dts_system.update_time
	 *
	 * @mbg.generated
	 */
	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column dts_system.deleted
	 *
	 * @return the value of dts_system.deleted
	 *
	 * @mbg.generated
	 */
	public Boolean getDeleted() {
		return deleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column dts_system.deleted
	 *
	 * @param deleted
	 *            the value for dts_system.deleted
	 *
	 * @mbg.generated
	 */
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_system
	 *
	 * @mbg.generated
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", keyName=").append(keyName);
		sb.append(", keyValue=").append(keyValue);
		sb.append(", addTime=").append(addTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", deleted=").append(deleted);
		sb.append("]");
		return sb.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_system
	 *
	 * @mbg.generated
	 */
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		DtsSystem other = (DtsSystem) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getKeyName() == null ? other.getKeyName() == null
						: this.getKeyName().equals(other.getKeyName()))
				&& (this.getKeyValue() == null ? other.getKeyValue() == null
						: this.getKeyValue().equals(other.getKeyValue()))
				&& (this.getAddTime() == null ? other.getAddTime() == null
						: this.getAddTime().equals(other.getAddTime()))
				&& (this.getUpdateTime() == null ? other.getUpdateTime() == null
						: this.getUpdateTime().equals(other.getUpdateTime()))
				&& (this.getDeleted() == null ? other.getDeleted() == null
						: this.getDeleted().equals(other.getDeleted()));
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_system
	 *
	 * @mbg.generated
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
		result = prime * result + ((getKeyValue() == null) ? 0 : getKeyValue().hashCode());
		result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
		result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
		result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
		return result;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_system
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	public void andLogicalDeleted(boolean deleted) {
		setDeleted(deleted ? IS_DELETED : NOT_DELETED);
	}

	/**
	 * This enum was generated by MyBatis Generator. This enum corresponds to the
	 * database table dts_system
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	public enum Column {
		id("id", "id", "INTEGER", false), keyName("key_name", "keyName", "VARCHAR", false), keyValue("key_value",
				"keyValue", "VARCHAR", false), addTime("add_time", "addTime", "TIMESTAMP", false), updateTime(
						"update_time", "updateTime", "TIMESTAMP", false), deleted("deleted", "deleted", "BIT", false);

		/**
		 * This field was generated by MyBatis Generator. This field corresponds to the
		 * database table dts_system
		 *
		 * @mbg.generated
		 * @project https://github.com/itfsw/mybatis-generator-plugin
		 */
		private static final String BEGINNING_DELIMITER = "`";

		/**
		 * This field was generated by MyBatis Generator. This field corresponds to the
		 * database table dts_system
		 *
		 * @mbg.generated
		 * @project https://github.com/itfsw/mybatis-generator-plugin
		 */
		private static final String ENDING_DELIMITER = "`";

		/**
		 * This field was generated by MyBatis Generator. This field corresponds to the
		 * database table dts_system
		 *
		 * @mbg.generated
		 * @project https://github.com/itfsw/mybatis-generator-plugin
		 */
		private final String column;

		/**
		 * This field was generated by MyBatis Generator. This field corresponds to the
		 * database table dts_system
		 *
		 * @mbg.generated
		 * @project https://github.com/itfsw/mybatis-generator-plugin
		 */
		private final boolean isColumnNameDelimited;

		/**
		 * This field was generated by MyBatis Generator. This field corresponds to the
		 * database table dts_system
		 *
		 * @mbg.generated
		 * @project https://github.com/itfsw/mybatis-generator-plugin
		 */
		private final String javaProperty;

		/**
		 * This field was generated by MyBatis Generator. This field corresponds to the
		 * database table dts_system
		 *
		 * @mbg.generated
		 * @project https://github.com/itfsw/mybatis-generator-plugin
		 */
		private final String jdbcType;

		/**
		 * This method was generated by MyBatis Generator. This method corresponds to
		 * the database table dts_system
		 *
		 * @mbg.generated
		 * @project https://github.com/itfsw/mybatis-generator-plugin
		 */
		public String value() {
			return this.column;
		}

		/**
		 * This method was generated by MyBatis Generator. This method corresponds to
		 * the database table dts_system
		 *
		 * @mbg.generated
		 * @project https://github.com/itfsw/mybatis-generator-plugin
		 */
		public String getValue() {
			return this.column;
		}

		/**
		 * This method was generated by MyBatis Generator. This method corresponds to
		 * the database table dts_system
		 *
		 * @mbg.generated
		 * @project https://github.com/itfsw/mybatis-generator-plugin
		 */
		public String getJavaProperty() {
			return this.javaProperty;
		}

		/**
		 * This method was generated by MyBatis Generator. This method corresponds to
		 * the database table dts_system
		 *
		 * @mbg.generated
		 * @project https://github.com/itfsw/mybatis-generator-plugin
		 */
		public String getJdbcType() {
			return this.jdbcType;
		}

		/**
		 * This method was generated by MyBatis Generator. This method corresponds to
		 * the database table dts_system
		 *
		 * @mbg.generated
		 * @project https://github.com/itfsw/mybatis-generator-plugin
		 */
		Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
			this.column = column;
			this.javaProperty = javaProperty;
			this.jdbcType = jdbcType;
			this.isColumnNameDelimited = isColumnNameDelimited;
		}

		/**
		 * This method was generated by MyBatis Generator. This method corresponds to
		 * the database table dts_system
		 *
		 * @mbg.generated
		 * @project https://github.com/itfsw/mybatis-generator-plugin
		 */
		public String desc() {
			return this.getEscapedColumnName() + " DESC";
		}

		/**
		 * This method was generated by MyBatis Generator. This method corresponds to
		 * the database table dts_system
		 *
		 * @mbg.generated
		 * @project https://github.com/itfsw/mybatis-generator-plugin
		 */
		public String asc() {
			return this.getEscapedColumnName() + " ASC";
		}

		/**
		 * This method was generated by MyBatis Generator. This method corresponds to
		 * the database table dts_system
		 *
		 * @mbg.generated
		 * @project https://github.com/itfsw/mybatis-generator-plugin
		 */
		public static Column[] excludes(Column... excludes) {
			ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
			if (excludes != null && excludes.length > 0) {
				columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
			}
			return columns.toArray(new Column[] {});
		}

		/**
		 * This method was generated by MyBatis Generator. This method corresponds to
		 * the database table dts_system
		 *
		 * @mbg.generated
		 * @project https://github.com/itfsw/mybatis-generator-plugin
		 */
		public String getEscapedColumnName() {
			if (this.isColumnNameDelimited) {
				return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER)
						.toString();
			} else {
				return this.column;
			}
		}
	}
}