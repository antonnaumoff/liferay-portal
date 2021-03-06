/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.sync.engine.util;

/**
 * @author Shinn Lok
 */
public interface PropsKeys {

	public static final String SYNC_ACCOUNT_FILE_PATH_NAME =
		"sync.account.file.path.name";

	public static final String SYNC_ACCOUNT_LOGIN = "sync.account.login";

	public static final String SYNC_ACCOUNT_PASSWORD = "sync.account.password";

	public static final String SYNC_ACCOUNT_PLUGIN_VERSION =
		"sync.account.plugin.version";

	public static final String SYNC_ACCOUNT_SITES = "sync.account.sites";

	public static final String SYNC_ACCOUNT_URL = "sync.account.url";

	public static final String SYNC_CONFIGURATION_DIRECTORY =
		"sync.configuration.directory";

	public static final String SYNC_DATABASE_NAME = "sync.database.name";

	public static final String SYNC_FILE_BLACKLIST_CHARS =
		"sync.file.blacklist.chars";

	public static final String SYNC_FILE_BLACKLIST_CHARS_LAST =
		"sync.file.blacklist.chars.last";

	public static final String SYNC_FILE_BLACKLIST_NAMES =
		"sync.file.blacklist.names";

	public static final String SYNC_FILE_CHECKSUM_THRESHOLD_SIZE =
		"sync.file.checksum.threshold.size";

	public static final String SYNC_FILE_IGNORE_HIDDEN =
		"sync.file.ignore.hidden";

	public static final String SYNC_FILE_IGNORE_NAMES =
		"sync.file.ignore.names";

	public static final String SYNC_FILE_PATCHING_IGNORE_EXTENSIONS =
		"sync.file.patching.ignore.extensions";

	public static final String SYNC_FILE_PATCHING_THRESHOLD_SIZE_RATIO =
		"sync.file.patching.threshold.size.ratio";

	public static final String SYNC_HTTP_CONNECTION_TIMEOUT =
		"sync.http.connection.timeout";

	public static final String SYNC_HTTP_SOCKET_TIMEOUT =
		"sync.http.socket.timeout";

	public static final String SYNC_LAN_SERVER_BROADCAST_INTERVAL =
		"sync.lan.server.broadcast.interval";

	public static final String SYNC_LAN_SERVER_MAX_CONNECTIONS =
		"sync.lan.server.max.connections";

	public static final String SYNC_LAN_SERVER_PORT = "sync.lan.server.port";

	public static final String SYNC_LAN_SERVER_WRITE_DELAY =
		"sync.lan.server.write.delay";

	public static final String SYNC_LAN_SESSION_DOWNLOAD_CONNECT_TIMEOUT =
		"sync.lan.session.download.connect.timeout";

	public static final String SYNC_LAN_SESSION_DOWNLOAD_MAX_PER_ROUTE =
		"sync.lan.session.download.max.per.route";

	public static final String SYNC_LAN_SESSION_DOWNLOAD_MAX_TOTAL =
		"sync.lan.session.download.max.total";

	public static final String SYNC_LAN_SESSION_DOWNLOAD_SOCKET_TIMEOUT =
		"sync.lan.session.download.socket.timeout";

	public static final String SYNC_LAN_SESSION_QUERY_CONNECT_TIMEOUT =
		"sync.lan.session.query.connect.timeout";

	public static final String SYNC_LAN_SESSION_QUERY_POOL_MAX_SIZE =
		"sync.lan.session.query.pool.max.size";

	public static final String SYNC_LAN_SESSION_QUERY_SOCKET_TIMEOUT =
		"sync.lan.session.query.socket.timeout";

	public static final String SYNC_LAN_SESSION_QUERY_TOTAL_TIMEOUT =
		"sync.lan.session.query.total.timeout";

	public static final String SYNC_LAN_SESSION_QUEUE_CHECK_INTERVAL =
		"sync.lan.session.queue.check.interval";

	public static final String SYNC_LAN_SESSION_QUEUE_DURATION_RATE =
		"sync.lan.session.queue.duration.rate";

	public static final String SYNC_LAN_SESSION_QUEUE_MAX_DURATION =
		"sync.lan.session.queue.max.duration";

	public static final String SYNC_LOGGER_CONFIGURATION_FILE =
		"sync.logger.configuration.file";

	public static final String SYNC_NOTIFICATION_FIELD_NAMES_PREFIX =
		"sync.notification.field.names";

	public static final String SYNC_OAUTH_ACCESS_TOKEN_URL =
		"sync.oauth.access.token.url";

	public static final String SYNC_OAUTH_AUTHORIZATION_URL =
		"sync.oauth.authorization.url";

	public static final String SYNC_OAUTH_REQUEST_TOKEN_URL =
		"sync.oauth.request.token.url";

	public static final String SYNC_OAUTH_WEBSITE_URL =
		"sync.oauth.website.url";

}