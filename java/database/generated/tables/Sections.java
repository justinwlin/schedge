/*
 * This file is generated by jOOQ.
 */
package database.generated.tables;


import database.generated.Indexes;
import database.generated.Keys;
import database.generated.Public;
import database.generated.tables.records.SectionsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sections extends TableImpl<SectionsRecord> {

    private static final long serialVersionUID = -1347351231;

    /**
     * The reference instance of <code>public.sections</code>
     */
    public static final Sections SECTIONS = new Sections();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SectionsRecord> getRecordType() {
        return SectionsRecord.class;
    }

    /**
     * The column <code>public.sections.id</code>.
     */
    public final TableField<SectionsRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('sections_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.sections.registration_number</code>.
     */
    public final TableField<SectionsRecord, Integer> REGISTRATION_NUMBER = createField("registration_number", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.sections.course_id</code>.
     */
    public final TableField<SectionsRecord, Long> COURSE_ID = createField("course_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.sections.section_number</code>.
     */
    public final TableField<SectionsRecord, Integer> SECTION_NUMBER = createField("section_number", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.sections.term_id</code>.
     */
    public final TableField<SectionsRecord, Integer> TERM_ID = createField("term_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.sections.instructor</code>.
     */
    public final TableField<SectionsRecord, String> INSTRUCTOR = createField("instructor", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.sections.type</code>.
     */
    public final TableField<SectionsRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.sections.associated_with</code>.
     */
    public final TableField<SectionsRecord, Long> ASSOCIATED_WITH = createField("associated_with", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.sections</code> table reference
     */
    public Sections() {
        this(DSL.name("sections"), null);
    }

    /**
     * Create an aliased <code>public.sections</code> table reference
     */
    public Sections(String alias) {
        this(DSL.name(alias), SECTIONS);
    }

    /**
     * Create an aliased <code>public.sections</code> table reference
     */
    public Sections(Name alias) {
        this(alias, SECTIONS);
    }

    private Sections(Name alias, Table<SectionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sections(Name alias, Table<SectionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Sections(Table<O> child, ForeignKey<O, SectionsRecord> key) {
        super(child, key, SECTIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SECTIONS_ASSOCIATED_WITH, Indexes.SECTIONS_COURSE_ID, Indexes.SECTIONS_PKEY, Indexes.SECTIONS_REGISTRATION_NUMBER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SectionsRecord, Long> getIdentity() {
        return Keys.IDENTITY_SECTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SectionsRecord> getPrimaryKey() {
        return Keys.SECTIONS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SectionsRecord>> getKeys() {
        return Arrays.<UniqueKey<SectionsRecord>>asList(Keys.SECTIONS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sections as(String alias) {
        return new Sections(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sections as(Name alias) {
        return new Sections(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sections rename(String name) {
        return new Sections(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sections rename(Name name) {
        return new Sections(name, null);
    }
}
