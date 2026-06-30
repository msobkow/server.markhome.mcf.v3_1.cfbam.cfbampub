
// Description: Java 25 public DbIO interface for Param.

/*
 *	server.markhome.mcf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal CFBam 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal CFBam.
 *	
 *	Mark's Code Fractal CFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal CFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal CFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal CFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.mcf.v3_1.cfbam.cfbampub;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.mcf.v3_1.cflib.*;
import server.markhome.mcf.v3_1.cflib.dbutil.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpub.*;
import server.markhome.mcf.v3_1.cfint.cfintpub.*;
import server.markhome.mcf.v3_1.cfsec.cfsecpubobj.*;
import server.markhome.mcf.v3_1.cfint.cfintpubobj.*;
import server.markhome.mcf.v3_1.cfbam.cfbampubobj.*;

/*
 *	CFBamPubParamTable public database interface for Param has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface ICFBamPubParamTable
{
	public static final String TABLE_NAME = "Param";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	ICFBamPubParam createParam( ICFSecPubAuthorization Authorization,
		ICFBamPubParam rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	ICFBamPubParam updateParam( ICFSecPubAuthorization Authorization,
		ICFBamPubParam rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	void deleteParam( ICFSecPubAuthorization Authorization,
		ICFBamPubParam rec );
	/**
	 *	Delete the Param instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteParamByIdIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 argKey );
	/**
	 *	Delete the Param instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByUNameIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 argServerMethodId,
		String argName );

	/**
	 *	Delete the Param instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteParamByUNameIdx( ICFSecPubAuthorization Authorization,
		ICFBamPubParamByUNameIdxKey argKey );
	/**
	 *	Delete the Param instances identified by the key ServerMethodIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByServerMethodIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 argServerMethodId );

	/**
	 *	Delete the Param instances identified by the key ServerMethodIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteParamByServerMethodIdx( ICFSecPubAuthorization Authorization,
		ICFBamPubParamByServerMethodIdxKey argKey );
	/**
	 *	Delete the Param instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByDefSchemaIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 argDefSchemaId );

	/**
	 *	Delete the Param instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteParamByDefSchemaIdx( ICFSecPubAuthorization Authorization,
		ICFBamPubParamByDefSchemaIdxKey argKey );
	/**
	 *	Delete the Param instances identified by the key ServerTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TypeId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByServerTypeIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 argTypeId );

	/**
	 *	Delete the Param instances identified by the key ServerTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteParamByServerTypeIdx( ICFSecPubAuthorization Authorization,
		ICFBamPubParamByServerTypeIdxKey argKey );
	/**
	 *	Delete the Param instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByPrevIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 argPrevId );

	/**
	 *	Delete the Param instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteParamByPrevIdx( ICFSecPubAuthorization Authorization,
		ICFBamPubParamByPrevIdxKey argKey );
	/**
	 *	Delete the Param instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByNextIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 argNextId );

	/**
	 *	Delete the Param instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteParamByNextIdx( ICFSecPubAuthorization Authorization,
		ICFBamPubParamByNextIdxKey argKey );
	/**
	 *	Delete the Param instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByContPrevIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 argServerMethodId,
		CFLibDbKeyHash256 argPrevId );

	/**
	 *	Delete the Param instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteParamByContPrevIdx( ICFSecPubAuthorization Authorization,
		ICFBamPubParamByContPrevIdxKey argKey );
	/**
	 *	Delete the Param instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Param key attribute of the instance generating the id.
	 */
	void deleteParamByContNextIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 argServerMethodId,
		CFLibDbKeyHash256 argNextId );

	/**
	 *	Delete the Param instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteParamByContNextIdx( ICFSecPubAuthorization Authorization,
		ICFBamPubParamByContNextIdxKey argKey );


	/**
	 *	Read the derived Param record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Param instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ICFBamPubParam readDerived( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the derived Param record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Param instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ICFBamPubParam lockDerived( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read all Param instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	ICFBamPubParam[] readPubAllDerived( ICFSecPubAuthorization Authorization );

	/**
	 *	Read the derived Param record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The Param key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	ICFBamPubParam readDerivedByIdIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 Id );

	/**
	 *	Read the derived Param record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Param key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	ICFBamPubParam readDerivedByUNameIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 ServerMethodId,
		String Name );

	/**
	 *	Read an array of the derived Param record instances identified by the duplicate key ServerMethodIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ICFBamPubParam[] readDerivedByServerMethodIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 ServerMethodId );

	/**
	 *	Read an array of the derived Param record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ICFBamPubParam[] readDerivedByDefSchemaIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the derived Param record instances identified by the duplicate key ServerTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TypeId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ICFBamPubParam[] readDerivedByServerTypeIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 TypeId );

	/**
	 *	Read an array of the derived Param record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ICFBamPubParam[] readDerivedByPrevIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived Param record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ICFBamPubParam[] readDerivedByNextIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived Param record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ICFBamPubParam[] readDerivedByContPrevIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 ServerMethodId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived Param record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ICFBamPubParam[] readDerivedByContNextIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 ServerMethodId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read the specific Param record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Param instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFBamPubParam readRec( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Lock the specific Param record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Param instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFBamPubParam lockRec( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 PKey );

	/**
	 *	Read all the specific Param record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific Param instances in the database accessible for the Authorization.
	 */
	ICFBamPubParam[] readAllRec( ICFSecPubAuthorization Authorization );

	/**
	 *	Read the specific Param record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The Param key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFBamPubParam readRecByIdIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 Id );

	/**
	 *	Read the specific Param record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Param key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFBamPubParam readRecByUNameIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 ServerMethodId,
		String Name );

	/**
	 *	Read an array of the specific Param record instances identified by the duplicate key ServerMethodIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFBamPubParam[] readRecByServerMethodIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 ServerMethodId );

	/**
	 *	Read an array of the specific Param record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFBamPubParam[] readRecByDefSchemaIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the specific Param record instances identified by the duplicate key ServerTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TypeId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFBamPubParam[] readRecByServerTypeIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 TypeId );

	/**
	 *	Read an array of the specific Param record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFBamPubParam[] readRecByPrevIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific Param record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFBamPubParam[] readRecByNextIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific Param record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFBamPubParam[] readRecByContPrevIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 ServerMethodId,
		CFLibDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific Param record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ServerMethodId	The Param key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Param key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	ICFBamPubParam[] readRecByContNextIdx( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 ServerMethodId,
		CFLibDbKeyHash256 NextId );

	/**
	 *	Move the specified record up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	ICFBamPubParam moveRecUp( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 Id,
		int revision );

	/**
	 *	Move the specified record down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	ICFBamParam moveRecDown( ICFSecPubAuthorization Authorization,
		CFLibDbKeyHash256 Id,
		int revision );
}
