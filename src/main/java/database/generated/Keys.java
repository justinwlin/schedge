/*
 * This file is generated by jOOQ.
 */
package database.generated;


import database.generated.tables.Courses;
import database.generated.tables.FlywaySchemaHistory;
import database.generated.tables.Meetings;
import database.generated.tables.Sections;
import database.generated.tables.records.CoursesRecord;
import database.generated.tables.records.FlywaySchemaHistoryRecord;
import database.generated.tables.records.MeetingsRecord;
import database.generated.tables.records.SectionsRecord;

import javax.annotation.processing.Generated;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code></code> schema.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CoursesRecord> PK_COURSES = UniqueKeys0.PK_COURSES;
    public static final UniqueKey<FlywaySchemaHistoryRecord> PK_FLYWAY_SCHEMA_HISTORY = UniqueKeys0.PK_FLYWAY_SCHEMA_HISTORY;
    public static final UniqueKey<MeetingsRecord> PK_MEETINGS = UniqueKeys0.PK_MEETINGS;
    public static final UniqueKey<SectionsRecord> PK_SECTIONS = UniqueKeys0.PK_SECTIONS;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<MeetingsRecord, SectionsRecord> FK_MEETINGS_SECTIONS_1 = ForeignKeys0.FK_MEETINGS_SECTIONS_1;
    public static final ForeignKey<SectionsRecord, CoursesRecord> FK_SECTIONS_COURSES_1 = ForeignKeys0.FK_SECTIONS_COURSES_1;
    public static final ForeignKey<SectionsRecord, SectionsRecord> FK_SECTIONS_SECTIONS_1 = ForeignKeys0.FK_SECTIONS_SECTIONS_1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<CoursesRecord> PK_COURSES = Internal.createUniqueKey(Courses.COURSES, "pk_courses", new TableField[] { Courses.COURSES.ID }, true);
        public static final UniqueKey<FlywaySchemaHistoryRecord> PK_FLYWAY_SCHEMA_HISTORY = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "pk_flyway_schema_history", new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
        public static final UniqueKey<MeetingsRecord> PK_MEETINGS = Internal.createUniqueKey(Meetings.MEETINGS, "pk_meetings", new TableField[] { Meetings.MEETINGS.ID }, true);
        public static final UniqueKey<SectionsRecord> PK_SECTIONS = Internal.createUniqueKey(Sections.SECTIONS, "pk_sections", new TableField[] { Sections.SECTIONS.ID }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<MeetingsRecord, SectionsRecord> FK_MEETINGS_SECTIONS_1 = Internal.createForeignKey(Keys.PK_SECTIONS, Meetings.MEETINGS, "fk_meetings_sections_1", new TableField[] { Meetings.MEETINGS.SECTION_ID }, true);
        public static final ForeignKey<SectionsRecord, CoursesRecord> FK_SECTIONS_COURSES_1 = Internal.createForeignKey(Keys.PK_COURSES, Sections.SECTIONS, "fk_sections_courses_1", new TableField[] { Sections.SECTIONS.COURSE_ID }, true);
        public static final ForeignKey<SectionsRecord, SectionsRecord> FK_SECTIONS_SECTIONS_1 = Internal.createForeignKey(Keys.PK_SECTIONS, Sections.SECTIONS, "fk_sections_sections_1", new TableField[] { Sections.SECTIONS.ASSOCIATED_WITH }, true);
    }
}
