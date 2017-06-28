/**
 * This class is generated by jOOQ
 */
package com.ethercis.jooq.pg.tables;


import com.ethercis.jooq.pg.Ehr;
import com.ethercis.jooq.pg.Keys;
import com.ethercis.jooq.pg.tables.records.TemplateRecord;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Template extends TableImpl<TemplateRecord> {

	private static final long serialVersionUID = 2067344746;

	/**
	 * The reference instance of <code>ehr.template</code>
	 */
	public static final Template TEMPLATE = new Template();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TemplateRecord> getRecordType() {
		return TemplateRecord.class;
	}

	/**
	 * The column <code>ehr.template.uid</code>.
	 */
	public final TableField<TemplateRecord, UUID> UID = createField("uid", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

	/**
	 * The column <code>ehr.template.template_id</code>.
	 */
	public final TableField<TemplateRecord, String> TEMPLATE_ID = createField("template_id", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>ehr.template.concept</code>.
	 */
	public final TableField<TemplateRecord, String> CONCEPT = createField("concept", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * Create a <code>ehr.template</code> table reference
	 */
	public Template() {
		this("template", null);
	}

	/**
	 * Create an aliased <code>ehr.template</code> table reference
	 */
	public Template(String alias) {
		this(alias, TEMPLATE);
	}

	private Template(String alias, Table<TemplateRecord> aliased) {
		this(alias, aliased, null);
	}

	private Template(String alias, Table<TemplateRecord> aliased, Field<?>[] parameters) {
		super(alias, Ehr.EHR, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TemplateRecord> getPrimaryKey() {
		return Keys.TEMPLATE_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TemplateRecord>> getKeys() {
		return Arrays.<UniqueKey<TemplateRecord>>asList(Keys.TEMPLATE_PKEY, Keys.TEMPLATE_TEMPLATE_ID_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Template as(String alias) {
		return new Template(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Template rename(String name) {
		return new Template(name, null);
	}
}