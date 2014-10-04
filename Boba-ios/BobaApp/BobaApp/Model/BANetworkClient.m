//
//  BANetworkClient.m
//  BobaApp
//
//  Created by Hyun Bin Kim on 2014-10-04.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import "BANetworkClient.h"
#import <AFNetworking/AFNetworking.h>

@interface BANetworkClient()

@end

@implementation BANetworkClient

+ (id)sharedClient {
    static BANetworkClient *sharedClient = nil;
    static dispatch_once_t once_token;
    dispatch_once(&once_token, ^{
        sharedClient = [[self alloc] init];
    });
    
    return sharedClient;
}

- (instancetype)init
{
    self = [super init];
    if (self) {
    }
    return self;
}

#pragma mark - User

- (void)registerNewUserWithUseremail:(NSString *)userEmail password:(NSString *)password {
    // some bs
}

- (void)getUserDetailsWithUserEmail:(NSString *)userEmail {
    // more bs
}

#pragma mark - Group

- (void)createNewGroupWithGroupName:(NSString *)groupName password:(NSString *)password {
    // bunch of bs
}

- (void)addNewGroupMemberWithGroupName:(NSString *)groupName userEmail:(NSString *)userEmail {
    
}

#pragma mark - Run
- (void)getCurrentActiveRunsWithGroupName:(NSString *)groupName {
    // bunch of shit
}

- (void)createNewRunWithGroupName:(NSString *)groupName {
    // more shit
}

- (void)getRunStatusWithGroupName:(NSString *)groupName runName:(NSString *)runName {
    // shitty shit
}

- (void)addUserToRunWithUserEmail:(NSString *)userEmail GroupName:(NSString *)groupName runName:(NSString *)runName {
    
}

- (void)markRunCompletedWithGroupName:(NSString *)groupName runName:(NSString *)runName {
    // bunch of shitty fucking shit
}

- (void)markUserPaidWithUserEmail:(NSString *)userEmail groupName:(NSString *)groupName runName:(NSString *)runName {
    
}


@end
