/*
 * This file is generated by jOOQ.
 */
package net.runelite.client.database.data.tables.records;


import java.util.UUID;
import javax.annotation.processing.Generated;
import net.runelite.client.database.data.tables.Loottrackerlink;
import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.12.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class LoottrackerlinkRecord extends TableRecordImpl<LoottrackerlinkRecord> implements Record4<UUID, UUID, UUID, UUID>
{

	private static final long serialVersionUID = -1701074584;

	/**
	 * Setter for <code>PUBLIC.LOOTTRACKERLINK.LINKUNIQUEID</code>.
	 */
	public void setLinkuniqueid(UUID value)
	{
		set(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.LOOTTRACKERLINK.LINKUNIQUEID</code>.
	 */
	public UUID getLinkuniqueid()
	{
		return (UUID) get(0);
	}

	/**
	 * Setter for <code>PUBLIC.LOOTTRACKERLINK.EVENTUNIQUEID</code>.
	 */
	public void setEventuniqueid(UUID value)
	{
		set(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.LOOTTRACKERLINK.EVENTUNIQUEID</code>.
	 */
	public UUID getEventuniqueid()
	{
		return (UUID) get(1);
	}

	/**
	 * Setter for <code>PUBLIC.LOOTTRACKERLINK.DROPUNIQUEID</code>.
	 */
	public void setDropuniqueid(UUID value)
	{
		set(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.LOOTTRACKERLINK.DROPUNIQUEID</code>.
	 */
	public UUID getDropuniqueid()
	{
		return (UUID) get(2);
	}

	/**
	 * Setter for <code>PUBLIC.LOOTTRACKERLINK.USERUNIQUEID</code>.
	 */
	public void setUseruniqueid(UUID value)
	{
		set(3, value);
	}

	/**
	 * Getter for <code>PUBLIC.LOOTTRACKERLINK.USERUNIQUEID</code>.
	 */
	public UUID getUseruniqueid()
	{
		return (UUID) get(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	@Override
	public Row4<UUID, UUID, UUID, UUID> fieldsRow()
	{
		return (Row4) super.fieldsRow();
	}

	@Override
	public Row4<UUID, UUID, UUID, UUID> valuesRow()
	{
		return (Row4) super.valuesRow();
	}

	@Override
	public Field<UUID> field1()
	{
		return Loottrackerlink.LOOTTRACKERLINK.LINKUNIQUEID;
	}

	@Override
	public Field<UUID> field2()
	{
		return Loottrackerlink.LOOTTRACKERLINK.EVENTUNIQUEID;
	}

	@Override
	public Field<UUID> field3()
	{
		return Loottrackerlink.LOOTTRACKERLINK.DROPUNIQUEID;
	}

	@Override
	public Field<UUID> field4()
	{
		return Loottrackerlink.LOOTTRACKERLINK.USERUNIQUEID;
	}

	@Override
	public UUID component1()
	{
		return getLinkuniqueid();
	}

	@Override
	public UUID component2()
	{
		return getEventuniqueid();
	}

	@Override
	public UUID component3()
	{
		return getDropuniqueid();
	}

	@Override
	public UUID component4()
	{
		return getUseruniqueid();
	}

	@Override
	public UUID value1()
	{
		return getLinkuniqueid();
	}

	@Override
	public UUID value2()
	{
		return getEventuniqueid();
	}

	@Override
	public UUID value3()
	{
		return getDropuniqueid();
	}

	@Override
	public UUID value4()
	{
		return getUseruniqueid();
	}

	@Override
	public LoottrackerlinkRecord value1(UUID value)
	{
		setLinkuniqueid(value);
		return this;
	}

	@Override
	public LoottrackerlinkRecord value2(UUID value)
	{
		setEventuniqueid(value);
		return this;
	}

	@Override
	public LoottrackerlinkRecord value3(UUID value)
	{
		setDropuniqueid(value);
		return this;
	}

	@Override
	public LoottrackerlinkRecord value4(UUID value)
	{
		setUseruniqueid(value);
		return this;
	}

	@Override
	public LoottrackerlinkRecord values(UUID value1, UUID value2, UUID value3, UUID value4)
	{
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached LoottrackerlinkRecord
	 */
	public LoottrackerlinkRecord()
	{
		super(Loottrackerlink.LOOTTRACKERLINK);
	}

	/**
	 * Create a detached, initialised LoottrackerlinkRecord
	 */
	public LoottrackerlinkRecord(UUID linkuniqueid, UUID eventuniqueid, UUID dropuniqueid, UUID useruniqueid)
	{
		super(Loottrackerlink.LOOTTRACKERLINK);

		set(0, linkuniqueid);
		set(1, eventuniqueid);
		set(2, dropuniqueid);
		set(3, useruniqueid);
	}
}
