//
//  BANetworkClient.h
//  BobaApp
//
//  Created by Hyun Bin Kim on 2014-10-04.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import <Foundation/Foundation.h>


typedef void (^BAHTTPClientSuccess)(id responseObject);
typedef void (^BAHTTPClientFailure)(NSError *error);

@interface BANetworkClient : NSObject
+ (id)sharedClient;

#pragma mark - User
- (void)registerNewUserWithUserEmail:(NSString *)userEmail phoneNumber:(NSString *)phoneNumber success:(BAHTTPClientSuccess)success failure:(BAHTTPClientFailure)failure;
- (void)getUserDetailsWithUserEmail:(NSString *)userEmail success:(BAHTTPClientSuccess)success failure:(BAHTTPClientFailure)failure;

#pragma mark - Group
- (void)createNewGroupWithGroupName:(NSString *)groupName groupPassword:(NSString *)groupPassword success:(BAHTTPClientSuccess)success failure:(BAHTTPClientFailure)failure;
- (void)addNewGroupMemberWithGroupName:(NSString *)groupName userEmail:(NSString *)userEmail success:(BAHTTPClientSuccess)success failure:(BAHTTPClientFailure)failure;

#pragma mark - Run
- (void)getCurrentActiveRunsWithGroupName:(NSString *)groupName success:(BAHTTPClientSuccess)success failure:(BAHTTPClientFailure)failure;
- (void)createNewRunWithGroupName:(NSString *)groupName runName:(NSString *)runName yelpId:(NSString *)yelpId orderTime:(long)orderTime expireTime:(long)expireTime success:(BAHTTPClientSuccess)success failure:(BAHTTPClientFailure)failure;
- (void)getRunStatusWithGroupName:(NSString *)groupName runName:(NSString *)runName success:(BAHTTPClientSuccess)success failure:(BAHTTPClientFailure)failure;
- (void)addUserToRunWithUserEmail:(NSString *)userEmail GroupName:(NSString *)groupName runName:(NSString *)runName success:(BAHTTPClientSuccess)success failure:(BAHTTPClientFailure)failure;
- (void)markRunCompletedWithGroupName:(NSString *)groupName runName:(NSString *)runName success:(BAHTTPClientSuccess)success failure:(BAHTTPClientFailure)failure;
- (void)markUserPaidWithUserEmail:(NSString *)userEmail groupName:(NSString *)groupName runName:(NSString *)runName success:(BAHTTPClientSuccess)success failure:(BAHTTPClientFailure)failure;

@end
