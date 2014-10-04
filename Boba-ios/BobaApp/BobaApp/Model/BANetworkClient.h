//
//  BANetworkClient.h
//  BobaApp
//
//  Created by Hyun Bin Kim on 2014-10-04.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import <Foundation/Foundation.h>


typedef void (^PAHTTPClientSuccess)(id responseObject);
typedef void (^PAHTTPClientFailure)(NSError *error);

@interface BANetworkClient : NSObject
+ (id)sharedClient;

#pragma mark - User
- (void)registerNewUserWithUseremail:(NSString *)userEmail phoneNumber:(NSString *)phoneNumber success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure;
- (void)getUserDetailsWithUserEmail:(NSString *)userEmail success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure;

#pragma mark - Group
- (void)createNewGroupWithGroupName:(NSString *)groupName groupPassword:(NSString *)groupPassword success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure;
- (void)addNewGroupMemberWithGroupName:(NSString *)groupName userEmail:(NSString *)userEmail success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure;

#pragma mark - Run
- (void)getCurrentActiveRunsWithGroupName:(NSString *)groupName success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure;
- (void)createNewRunWithGroupName:(NSString *)groupName runName:(NSString *)runName yelpId:(NSString *)yelpId orderTime:(long)orderTime expireTime:(long)expireTime success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure;
- (void)getRunStatusWithGroupName:(NSString *)groupName runName:(NSString *)runName success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure;
- (void)addUserToRunWithUserEmail:(NSString *)userEmail GroupName:(NSString *)groupName runName:(NSString *)runName success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure;
- (void)markRunCompletedWithGroupName:(NSString *)groupName runName:(NSString *)runName success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure;
- (void)markUserPaidWithUserEmail:(NSString *)userEmail groupName:(NSString *)groupName runName:(NSString *)runName success:(PAHTTPClientSuccess)success failure:(PAHTTPClientFailure)failure;

@end
